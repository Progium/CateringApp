package com.progium.catering.contracts;

import java.util.List;

import com.progium.catering.ejb.Catering;

public class CateringResponse extends BaseResponse {

	private List<Catering> caterings;

	public CateringResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Catering> getCaterings() {
		return caterings;
	}

	public void setCatering(List<Catering> caterings) {
		this.caterings = caterings;
	}
}
