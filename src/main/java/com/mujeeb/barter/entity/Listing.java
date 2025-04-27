package com.mujeeb.barter.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Listing {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private User user;

    @Column
    private Date listedAt;

    @Column
    private Product product;
    
    @Column
    private Category category;
    
    @Column
    private Subcategory subcategory;
    
    @Column
    private String description;
    
    @Column
    private double quantity;

    public Listing() {
    }

    public Listing(User user, Date listedAt, Product product, Category category, Subcategory subcategory, String description, double quantity) {
        this.user = user;
        this.listedAt = listedAt;
        this.product = product;
        this.category = category;
        this.subcategory = subcategory;
        this.description = description;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Occasion{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", listedAt=" + listedAt +
                ", product=" + product +
                ", category=" + category +
                ", subcategory=" + subcategory +
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getListedAt() {
		return listedAt;
	}

	public void setListedAt(Date listedAt) {
		this.listedAt = listedAt;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
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
