package com.progium.catering.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progium.catering.repositories.CateringRepository;
import com.progium.catering.ejb.Catering;

@Service
public class CateringService implements CateringServiceInterface{

	@Autowired
	CateringRepository cateringRepository;
	
	@Override
	public Boolean saveCatering(Catering objCatering) {
		Catering objDBCatering = cateringRepository.save(objCatering);
		
		Boolean result = true;
		if(objDBCatering == null){
			result = false;
		}
		return result;
		
	}
}