package com.progium.catering.contracts;

import java.util.List;

import com.progium.catering.pojo.CantonPOJO;

public class CantonResponse extends BaseResponse{

	private List<CantonPOJO> listaCanton;

	public CantonResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<CantonPOJO> getListaCanton() {
		return listaCanton;
	}

	public void setListaCanton(List<CantonPOJO> listaCanton) {
		this.listaCanton = listaCanton;
	}

}
