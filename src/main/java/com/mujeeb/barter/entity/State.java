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
public class State {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private String name;
    
    @Column
    private Long countryId;

    @OneToMany(targetEntity = City.class)
    @JoinColumn(name="id")
    private List<Long> cityIds;

    protected State() {
    }

    public State(String name, List<Long> cityIds) {
        this.name = name;
        this.cityIds = cityIds;
    }

    @Override
    public String toString() {
        return "NamazTime{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cityIds=" + cityIds +
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

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public List<Long> getCityIds() {
		return cityIds;
	}

	public void setCityIds(List<Long> cityIds) {
		this.cityIds = cityIds;
	}
}
