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
import com.progium.catering.contracts.UsuarioResponse;
import com.progium.catering.contracts.UsuarioRequest;
import com.progium.catering.ejb.Tipo;
import com.progium.catering.ejb.Usuario;
import com.progium.catering.pojo.UsuarioPOJO;
import com.progium.catering.services.GeneralServiceInterface;
import com.progium.catering.services.UsuarioServiceInterface;
import com.progium.catering.utils.GeneradorContrasennaUtil;
import com.progium.catering.utils.Utils;
import com.progium.catering.utils.SendEmail;

/**
 * Handles requests for the application home page.
 */
@RestController
@RequestMapping(value = "rest/protected/usuario")
public class UsuarioController {

	@Autowired
	UsuarioServiceInterface usuarioService;

	@Autowired
	GeneralServiceInterface generalService;

	@Autowired
	ServletContext servletContext;

	public UsuarioController() {
		// TODO Auto-generated constructor stub
	}
	//Obtiene los parametros que le envia el controller por medio del metodo post.
	@RequestMapping(value = "/registrar", method = RequestMethod.POST)
	@Transactional
	public UsuarioResponse registrar(@RequestParam("file") MultipartFile file,
			@RequestParam("nombre") String nombre,
			@RequestParam("apellido1") String apellido1,
			@RequestParam("apellido2") String apellido2,
			@RequestParam("correo") String correo,
			@RequestParam("telefono1") String telefono1,
			@RequestParam("telefono2") String telefono2,
			@RequestParam("tipoUsuarioId") int tipoUsuarioId,
			@RequestParam("contrasenna") String contrasenna)
			throws NoSuchAlgorithmException {
		//Crea un nuevo usuario response le setea los datos y le pasa el objeto de usuario al servicio de usuario
		UsuarioResponse us = new UsuarioResponse();
		Tipo objTipo = generalService.getTipoById(tipoUsuarioId);
		String resultFileName = Utils.writeToFile(file, servletContext);

		Usuario objNuevoUsuario = new Usuario();
		objNuevoUsuario.setNombre(nombre);
		objNuevoUsuario.setApellido1(apellido1);
		objNuevoUsuario.setApellido2(apellido2);
		objNuevoUsuario.setCorreo(correo);
		objNuevoUsuario.setTelefono1(telefono1);
		objNuevoUsuario.setTelefono2(telefono2);
		objNuevoUsuario.setTipo(objTipo);
		objNuevoUsuario.setFotografia(resultFileName);
		objNuevoUsuario.setContrasenna(GeneradorContrasennaUtil
				.encriptarContrasenna(contrasenna));

		Boolean state = usuarioService.saveUsuario(objNuevoUsuario);

		if (state) {
			us.setCode(200);
			us.setCodeMessage("user created succesfully");

			String mensaje = "Para ingresar al sistema debe utilizar las siguientes credenciales: "
					+ "Correo: "
					+ objNuevoUsuario.getCorreo()
					+ "</br>"
					+ " Contraseña: " + objNuevoUsuario.getContrasenna();
			SendEmail.sendEmail("Bienvenido a Catering App!",
					objNuevoUsuario.getCorreo(), "Nuevo Usuario",
					"Bienvenido a Catering App", mensaje);

		}else{
			us.setCode(401);
			us.setErrorMessage("Unauthorized User hola");
		}
		return us;
	}
}