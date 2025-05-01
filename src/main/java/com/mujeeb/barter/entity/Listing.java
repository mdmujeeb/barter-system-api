package com.mujeeb.barter.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Listing {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private Long userId;

    @Column
    private Date listedAt;

    @Column
    private Long productId;
    
    @Column
    private Long categoryId;
    
    @Column
    private Long subcategoryId;
    
    @Column
    private String description;
    
    @Column
    private double quantity;

    public Listing() {
    }

    public Listing(Long userId, Date listedAt, Long productId, Long categoryId, Long subcategoryId, String description, double quantity) {
        this.userId = userId;
        this.listedAt = listedAt;
        this.productId = productId;
        this.categoryId = categoryId;
        this.subcategoryId = subcategoryId;
        this.description = description;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Occasion{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", listedAt=" + listedAt +
                ", productId=" + productId +
                ", categoryId=" + categoryId +
                ", subcategoryId=" + subcategoryId +
                ", resultDescription=" + description +
                ", quantity=" + quantity +
                '}';
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getListedAt() {
		return listedAt;
	}

	public void setListedAt(Date listedAt) {
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

	public void setSubcategory(Long subcategoryId) {
		this.subcategoryId = subcategoryId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
}
