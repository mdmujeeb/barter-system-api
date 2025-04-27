package com.mujeeb.barter.beans.request;

public class ListingRequestBean extends BaseRequestBean {

	private static final long serialVersionUID = 1L;

	private String searchText = "";
	private Long productId = -1L;
	private Long categoryId = -1L;
	private Long subcategoryId = -1L;
	private Long targetUserId = -1L;
	private Integer resultCount = 10;
	
	public ListingRequestBean() {}
	
	public ListingRequestBean(String searchText, Long productId, Long categoryId, Long subcategoryId, Long targetUserId, Integer resultCount) {
		this.searchText = searchText;
		this.productId = productId;
		this.categoryId = categoryId;
		this.subcategoryId = subcategoryId;
		this.targetUserId = targetUserId;
		this.resultCount = resultCount;
	}

    @Override
    public String toString() {
        return "ListingRequestBean{" +
                "searchText=" + searchText +
                ", productId='" + productId + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", subcategoryId='" + subcategoryId + '\'' +
                ", targetUserId='" + targetUserId + '\'' +
                ", resultCount='" + resultCount + '\'' +
                '}';
    }

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getSubcategoryId() {
		return subcategoryId;
	}

	public void setSubcategory(Long subcategoryId) {
		this.subcategoryId = subcategoryId;
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
