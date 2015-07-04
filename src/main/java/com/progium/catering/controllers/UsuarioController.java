package com.progium.catering.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.progium.catering.contracts.TipoResponse;
import com.progium.catering.contracts.UsuarioResponse;
import com.progium.catering.ejb.Usuario;
import com.progium.catering.pojo.UsuarioPOJO;


/**
 * Handles requests for the application home page.
 */
@RestController
@RequestMapping(value ="rest/protected/rent")
public class UsuarioController {

	public UsuarioController() {
		// TODO Auto-generated constructor stub
	}

}
