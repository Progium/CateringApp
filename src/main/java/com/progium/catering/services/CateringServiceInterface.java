package com.progium.catering.services;

import java.util.List;

import com.progium.catering.ejb.Catering;

public interface CateringServiceInterface {

	Boolean saveCatering(Catering objCatering);
	//Obtiene un objeto catering
	Catering getCateringById(Integer idCatering);
	
}
