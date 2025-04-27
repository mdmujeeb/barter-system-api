package com.mujeeb.barter.beans.response;

import com.mujeeb.barter.beans.ProductBean;

public class ProductResponseBean extends ProductBean {

	private static final long serialVersionUID = -359413069975991280L;
	
	protected int resultCode = 0;
	protected String resultDescription = "Success.";

	public ProductResponseBean() {}
	
	public ProductResponseBean(String name, String description, Long categoryId, Long subcategoryId, String imageUrl, Long unitId) {
		this.name = name;
		this.description = description;
		this.categoryId = categoryId;
		this.subcategoryId = subcategoryId;
		this.imageUrl = imageUrl;
		this.unitId = unitId;
	}
	
	public ProductResponseBean(Long id, String name, String description, Long categoryId, Long subcategoryId, String imageUrl, Long unitId) {
		this(name, description, categoryId, subcategoryId, imageUrl, unitId);
		this.id = id;
	}
	
	public int getResultCode() {
		return resultCode;
	}
	
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	
	public String getResultDescription() {
		return resultDescription;
	}
	
	public void setResultDescription(String resultDescription) {
		this.resultDescription = resultDescription;
	}
}
