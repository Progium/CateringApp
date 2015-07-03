package com.progium.catering.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progium.catering.ejb.Categoria;
import com.progium.catering.repositories.CategoriaRepositorio;


public class CategoriaServices implements CategoriaServicesInterface{

	@Autowired
	CategoriaRepositorio categoriaRepositorio;
	
	@Override
	public List<Categoria> getAll() {
		return (List<Categoria>) categoriaRepositorio.findAll();
	}
}
