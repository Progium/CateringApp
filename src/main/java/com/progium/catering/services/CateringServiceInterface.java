package com.progium.catering.services;

import java.util.List;

import com.progium.catering.ejb.Catering;
import com.progium.catering.ejb.Producto;

public interface CateringServiceInterface {

	Boolean saveCatering(Catering objCatering);
	
	List<Catering> getNoUserCateringList(List<Integer> cateringids);

	Catering getCatering (int idCatering);
	List<Catering> getAll();

}
