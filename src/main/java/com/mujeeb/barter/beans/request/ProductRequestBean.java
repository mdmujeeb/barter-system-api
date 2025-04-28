package com.mujeeb.barter.beans.request;

import com.mujeeb.barter.beans.ProductBean;

public class ProductRequestBean extends ProductBean {

	private static final long serialVersionUID = 1L;
	
	protected Long userId;
	
	public ProductRequestBean() {}
	
	public ProductRequestBean(Long userId, String name, String description, Long categoryId, Long subcategoryId, String imageUrl, Long unitId) {
		this.userId = userId;
		this.name = name;
		this.description = description;
		this.categoryId = categoryId;
		this.subcategoryId = subcategoryId;
		this.imageUrl = imageUrl;
		this.unitId = unitId;
	}
	
	public ProductRequestBean(Long id, Long userId, String name, String description, Long categoryId, Long subcategoryId, String imageUrl, Long unitId) {
		this(userId, name, description, categoryId, subcategoryId, imageUrl, unitId);
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
