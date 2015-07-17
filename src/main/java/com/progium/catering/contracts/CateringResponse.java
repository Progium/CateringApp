package com.progium.catering.contracts;

import java.util.List;

import com.progium.catering.ejb.Catering;
import com.progium.catering.pojo.CateringPOJO;

public class CateringResponse extends BaseResponse {

	private List<CateringPOJO> cateringLista;

	public CateringResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<CateringPOJO> getCaterings() {
		return cateringLista;
	}

	public void setCateringLista(List<CateringPOJO> cateringLista) {
		this.cateringLista = cateringLista;
		
	}
		
	
}
