package com.progium.catering.services;

import java.util.List;

import com.progium.catering.ejb.Tipo;
import com.progium.catering.ejb.Provincia;

public interface GeneralServiceInterface {

	List<Tipo> getAllTipo();
	Tipo getTipoById(Integer idTipoUsuario);
	List<Provincia> getAllProvincia();
	Provincia getProvinciaById(Integer idProvincia);
}
