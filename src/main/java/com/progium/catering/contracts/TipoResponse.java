package com.progium.catering.contracts;

import java.util.List;

import com.progium.catering.pojo.TipoPOJO;

public class TipoResponse extends BaseResponse{

	private List<TipoPOJO> tipoLista;
	
	public TipoResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<TipoPOJO> getTipoLista() {
		return tipoLista;
	}

	public void setTipoLista(List<TipoPOJO> tipoLista) {
		this.tipoLista = tipoLista;
	}
	
}
