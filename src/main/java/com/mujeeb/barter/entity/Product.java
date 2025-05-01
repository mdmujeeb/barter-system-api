package com.mujeeb.barter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private String name;
    
    @Column
    private String description;

    @Column
    private Long categoryId;
    
    @Column
    private Long subcategoryId;
    
    @Column
    private Long orderId;
    
    @Column
    private String imageUrl;
    
    @Column
    private Long unitId;

    public Product() {
    }

    public Product(String name, String description, Long categoryId, Long subcategoryId, String imageUrl, Long unitId) {
        this.name = name;
        this.description = description;
        this.categoryId = categoryId;
        this.subcategoryId = subcategoryId;
        this.imageUrl = imageUrl;
        this.unitId = unitId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", resultDescription='" + description + '\'' +
                ", categoryId=" + categoryId +
                ", subcategoryId=" + subcategoryId +
                ", imageUrl=" + imageUrl +
                ", unitId=" + unitId +
                '}';
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Long getUnitId() {
		return unitId;
	}

	public void setUnitId(Long unitId) {
		this.unitId = unitId;
	}
}
