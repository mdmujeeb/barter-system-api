package com.mujeeb.barter.beans.response;

import com.mujeeb.barter.beans.ListingBean;

public class ListingResponseBean extends ListingBean {

	private static final long serialVersionUID = 1L;
	
	protected int resultCode = 0;
	protected String resultDescription = "Success.";
	
	public ListingResponseBean() {}
	
	public ListingResponseBean(int resultCode, String resultDescription) {
		this.resultCode = resultCode;
		this.resultDescription = resultDescription;
	}
	
	public ListingResponseBean(Long userId, String listedAt, Long productId, Long categoryId, Long subcategoryId, String description, Double quantity) {
		this.userId = userId;
		this.listedAt = listedAt;
		this.productId = productId;
		this.categoryId = categoryId;
		this.subcategoryId = subcategoryId;
		this.description = description;
		this.quantity = quantity;
	}
	
	public ListingResponseBean(Long id, Long userId, String listedAt, Long productId, Long categoryId, Long subcategoryId, String description, Double quantity) {
		this(userId, listedAt, productId, categoryId, subcategoryId, description, quantity);
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
