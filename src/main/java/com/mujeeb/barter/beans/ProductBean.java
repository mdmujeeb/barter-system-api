package com.mujeeb.barter.beans;

import java.io.Serializable;

public class ProductBean implements Serializable {

	private static final long serialVersionUID = 1L;
    protected Long id;
    protected String name;
    protected String description;
    protected Long categoryId;
    protected Long subcategoryId;
    protected String imageUrl;
    protected Long unitId;
	
	public ProductBean() {};
	
	public ProductBean(String name, String description, Long categoryId, Long subcategoryId, String imageUrl, Long unitId) {
		this.name = name;
		this.description = description;
		this.categoryId = categoryId;
		this.subcategoryId = subcategoryId;
		this.imageUrl = imageUrl;
		this.unitId = unitId;
	}
	
	public ProductBean(Long id, String name, String description, Long categoryId, Long subcategoryId, String imageUrl, Long unitId) {
		this(name, description, categoryId, subcategoryId, imageUrl, unitId);
		this.id = id;
	}
	
	@Override
	public String toString() {
        return "ProductBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", subcategoryId='" + subcategoryId + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", unitId='" + unitId + '\'' +
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
