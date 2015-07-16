package com.progium.catering.contracts;

import java.util.List;

import com.progium.catering.ejb.Catering;
import com.progium.catering.pojo.CateringPOJO;

public class CateringResponse extends BaseResponse {

	private List<Catering> caterings;

	public CateringResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Catering> getCaterings() {
		return caterings;
	}

//	public void setCatering(List<Catering> caterings) {
//		this.caterings = caterings;
//	}

	public void setCatering(List<CateringPOJO> viewList) {
		// TODO Auto-generated method stub
		
	}
		
//	public void setCatering(List<CateringPOJO> viewList) {
//		this.caterings = viewList;
//	}
//	
	
}
