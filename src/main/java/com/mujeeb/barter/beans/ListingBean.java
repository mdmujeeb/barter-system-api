package com.mujeeb.barter.beans;

import java.io.Serializable;

public class ListingBean implements Serializable {

	private static final long serialVersionUID = 1L;
    
    private Long id;
    private String userId;
    private String listedAt;
    private Long productId;
    private Long categoryId;
    private Long subcategoryId;
    private String description;
    private Double quantity;
	
	public ListingBean() {};
	
	public ListingBean(String userId, String listedAt, Long productId, Long categoryId, Long subcategoryId, String description, Double quantity) {
		this.userId = userId;
		this.listedAt = listedAt;
		this.productId = productId;
		this.categoryId = categoryId;
		this.subcategoryId = subcategoryId;
		this.description = description;
		this.quantity = quantity;
	}
	
	public ListingBean(Long id, String userId, String listedAt, Long productId, Long categoryId, Long subcategoryId, String description, Double quantity) {
		this(userId, listedAt, productId, categoryId, subcategoryId, description, quantity);
		this.id = id;
	}
	
	@Override
	public String toString() {
        return "ProductBean{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", listedAt='" + listedAt + '\'' +
                ", productId='" + productId + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", subcategoryId='" + subcategoryId + '\'' +
                ", description='" + description + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getListedAt() {
		return listedAt;
	}

	public void setListedAt(String listedAt) {
		this.listedAt = listedAt;
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

	public void setSubcategoryId(Long subcategoryId) {
		this.subcategoryId = subcategoryId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
}
