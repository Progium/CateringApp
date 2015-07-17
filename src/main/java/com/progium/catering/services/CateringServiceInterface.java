package com.progium.catering.services;

import java.util.List;
import org.springframework.data.domain.Page;
import com.progium.catering.contracts.UsuarioRequest;

import com.progium.catering.ejb.Catering;

public interface CateringServiceInterface {

	Boolean saveCatering(Catering objCatering);
	
	List<Catering> getCateringList(int idUsuario);

	List<Catering> getAll();

}
