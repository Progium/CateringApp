package com.progium.catering.contracts;

import java.util.List;

import com.progium.catering.pojo.UsuarioPOJO;

public class UsuarioResponse extends BaseResponse {

	private List<UsuarioPOJO> usuarios;
	
	public UsuarioResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<UsuarioPOJO> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<UsuarioPOJO> usuarios) {
		this.usuarios = usuarios;
	}
}
