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
    private Category category;
    
    @Column
    private Subcategory subcategory;
    
    @Column
    private String imageUrl;
    
    @Column
    private Unit unit;

    public Product() {
    }

    public Product(String name, String description, Category category, Subcategory subcategory, String imageUrl, Unit unit) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.subcategory = subcategory;
        this.imageUrl = imageUrl;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", resultDescription='" + description + '\'' +
                ", category=" + category +
                ", subcategory=" + subcategory +
                ", imageUrl=" + imageUrl +
                ", unit=" + unit +
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Subcategory getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(Subcategory subcategory) {
		this.subcategory = subcategory;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}
}
