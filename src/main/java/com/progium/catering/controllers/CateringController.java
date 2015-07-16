package com.progium.catering.controllers;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.progium.catering.contracts.TipoResponse;
import com.progium.catering.contracts.CateringResponse;
import com.progium.catering.contracts.CateringRequest;
import com.progium.catering.contracts.UsuarioResponse;
import com.progium.catering.contracts.ProvinciaResponse;
import com.progium.catering.contracts.CantonResponse;
import com.progium.catering.contracts.DistritoResponse;
import com.progium.catering.ejb.Provincia;
import com.progium.catering.ejb.Canton;
import com.progium.catering.ejb.Distrito;
import com.progium.catering.ejb.Catering;
import com.progium.catering.ejb.Tipo;
import com.progium.catering.ejb.Usuario;
import com.progium.catering.pojo.CateringPOJO;
import com.progium.catering.services.GeneralServiceInterface;
import com.progium.catering.services.CateringServiceInterface;
import com.progium.catering.utils.GeneradorContrasennaUtil;
import com.progium.catering.utils.SendEmail;
import com.progium.catering.utils.Utils;

/**
 * Handles requests for the application home page.
 */
@RestController
@RequestMapping(value = "rest/protected/catering")
public class CateringController {

	@Autowired
	CateringServiceInterface cateringService;

	@Autowired
	GeneralServiceInterface generalService;

	@Autowired
	ServletContext servletContext;

	public CateringController() {
		// TODO Auto-generated constructor stub
	}
	
	//Obtiene los parametros que le envia el controller por medio del metodo post.
	@RequestMapping(value = "/registrar", method = RequestMethod.POST)
	@Transactional
	public CateringResponse registrar(@RequestParam("file") MultipartFile file,
			@RequestParam("administradorId") int administradorId,
			@RequestParam("nombre") String nombre,
			@RequestParam("cedulaJuridica") String cedulaJuridica,
			@RequestParam("direccion") String direccion,
			@RequestParam("telefono1") String telefono1,
			@RequestParam("telefono2") String telefono2,
			@RequestParam("horario") String horario,
			@RequestParam("provinciaId") int provinciaId,
			@RequestParam("cantonId") int cantonId,
			@RequestParam("distritoId") int distritoId)
			throws NoSuchAlgorithmException {
		//Crea un nuevo usuario response le setea los datos y le pasa el objeto de catering al servicio de usuario
		CateringResponse cs = new CateringResponse();
		Usuario objUsuario = generalService.getUsuarioById(administradorId);
		Provincia objProvincia = generalService.getProvinciaById(provinciaId);
		Canton objCanton = generalService.getCantonById(cantonId);
		Distrito objDistrito = generalService.getDistritoById(distritoId);
		String resultFileName = Utils.writeToFile(file, servletContext);

		Catering objNuevoCatering = new Catering();
		objNuevoCatering.setUsuario(objUsuario);
		objNuevoCatering.setNombre(nombre);
		objNuevoCatering.setCedulaJuridica(cedulaJuridica);
		objNuevoCatering.setDireccion(direccion);
		objNuevoCatering.setTelefono1(telefono1);
		objNuevoCatering.setTelefono2(telefono2);
		objNuevoCatering.setHorario(horario);
		objNuevoCatering.setProvinciaId(provinciaId);
		objNuevoCatering.setCantonId(cantonId);
		objNuevoCatering.setDistrito(objDistrito);
		objNuevoCatering.setFotografia(resultFileName);
		objNuevoCatering.setEstado(false);

		Boolean state = cateringService.saveCatering(objNuevoCatering);

		if (state) {
			cs.setCode(200);
			cs.setCodeMessage("catering created succesfully");

		}else{
			cs.setCode(401);
			cs.setErrorMessage("Unauthorized User");
		}
		return cs;
	}

}
