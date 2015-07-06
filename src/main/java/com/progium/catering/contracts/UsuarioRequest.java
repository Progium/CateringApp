package com.progium.catering.contracts;

import com.progium.catering.pojo.UsuarioPOJO;

public class UsuarioRequest extends BasePagingRequest {

	private UsuarioPOJO usuario;
	
	public UsuarioRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UsuarioPOJO getUsario() {
		return usuario;
	}
	
	public void setUsuario(UsuarioPOJO usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "UsuarioRequest [usuario=" + usuario + "]";
	}

}
