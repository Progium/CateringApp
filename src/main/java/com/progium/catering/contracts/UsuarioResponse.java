package com.progium.catering.contracts;

import java.util.List;

import com.progium.catering.ejb.Usuario;

public class UsuarioResponse extends BaseResponse {

	private List<Usuario> usuarios;
	
	public UsuarioResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	
}
