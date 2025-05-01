package com.mujeeb.barter.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @OneToMany(targetEntity = Subcategory.class)
    @JoinColumn(name="id")
    private List<Long> subcategoryIds;
    
    @Column
    private Long productId;
    
    @Column
    private Long listingId;

    public Category() {
    }

    public Category(String name, List<Long> subcategoryIds) {
        this.name = name;
        this.subcategoryIds = subcategoryIds;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subcategoryIds=" + subcategoryIds +
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

	public List<Long> getSubcategoryIds() {
		return subcategoryIds;
	}

	public void setSubcategoryIds(List<Long> subcategoryIds) {
		this.subcategoryIds = subcategoryIds;
	}
}
