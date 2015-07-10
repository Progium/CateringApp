package com.progium.catering.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progium.catering.ejb.Tipo;
import com.progium.catering.ejb.Provincia;
import com.progium.catering.repositories.GeneralRepository;
import com.progium.catering.repositories.TipoRepository;
import com.progium.catering.repositories.ProvinciaRepository;

@Service
public class GeneralService implements GeneralServiceInterface{		
	
	@Autowired
	GeneralRepository generalRepository;
	
	@Autowired
	TipoRepository tipoRepository;
	
	@Autowired
	ProvinciaRepository provinciaRepository;
	

	@Override
	public List<Tipo> getAllTipo() {
		return tipoRepository.findAll();
	}

	@Override
	public Tipo getTipoById(Integer tipoUsuarioId) {
		return tipoRepository.findOne(tipoUsuarioId);
	}

	@Override
	public List<Provincia> getAllProvincia() {
		return provinciaRepository.findAll();
	}
	
	@Override
	public Provincia getProvinciaById(Integer idProvincia) {
		return provinciaRepository.findOne(idProvincia);
	}
}