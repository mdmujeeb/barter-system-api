package com.mujeeb.barter.beans.request;

import com.mujeeb.barter.beans.ListingBean;

public class ListingRequestBean extends ListingBean {

	private static final long serialVersionUID = 1L;
	
	protected Long userId;
	protected String searchText;
	protected Long targetUserId;
	protected Integer resultCount = 10;
	
	public ListingRequestBean() {}
	
	public ListingRequestBean(Long userId, String searchText, Long targetUserId, String listedAt, Long productId, Long categoryId, Long subcategoryId, String description, Double quantity, Integer resultCount) {
		this.userId = userId;
		this.searchText = searchText;
		this.targetUserId = targetUserId;
		this.listedAt = listedAt;
		this.productId = productId;
		this.categoryId = categoryId;
		this.subcategoryId = subcategoryId;
		this.description = description;
		this.quantity = quantity;
	}
	
	public ListingRequestBean(Long id, Long userId, String searchText, Long targetUserId, String listedAt, Long productId, Long categoryId, Long subcategoryId, String description, Double quantity, Integer resultCount) {
		this(userId, searchText, targetUserId, listedAt, productId, categoryId, subcategoryId, description, quantity, resultCount);
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

	public Long getTargetUserId() {
		return targetUserId;
	}

	public void setTargetUserId(Long targetUserId) {
		this.targetUserId = targetUserId;
	}

	public Integer getResultCount() {
		return resultCount;
	}

	public void setResultCount(Integer resultCount) {
		this.resultCount = resultCount;
	}	
}
