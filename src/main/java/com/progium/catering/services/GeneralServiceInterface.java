package com.progium.catering.services;

import java.util.List;

import com.progium.catering.ejb.Tipo;

public interface GeneralServiceInterface {

	List<Tipo> getAllTipo();
	Tipo getTipoById(Integer idTipoUsuario);
}
