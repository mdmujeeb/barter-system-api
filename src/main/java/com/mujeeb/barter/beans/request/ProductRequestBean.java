package com.mujeeb.barter.beans.request;

import com.mujeeb.barter.beans.ProductBean;

public class ProductRequestBean extends ProductBean {

	private static final long serialVersionUID = 1L;
	
	protected String userId;
	protected String password;
	
	public ProductRequestBean() {}
	
	public ProductRequestBean(String name, String description, Long categoryId, Long subcategoryId, String imageUrl, Long unitId) {
		this.name = name;
		this.description = description;
		this.categoryId = categoryId;
		this.subcategoryId = subcategoryId;
		this.imageUrl = imageUrl;
		this.unitId = unitId;
	}
	
	public ProductRequestBean(Long id, String name, String description, Long categoryId, Long subcategoryId, String imageUrl, Long unitId) {
		this(name, description, categoryId, subcategoryId, imageUrl, unitId);
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
