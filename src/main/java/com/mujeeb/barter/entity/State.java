package com.mujeeb.barter.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class State {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private List<City> cities;

    private State() {
    }

    public State(String name, List<City> cities) {
        this.name = name;
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "NamazTime{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cities=" + cities +
                '}';
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
	public City findCityByName(String city) {
		
		Optional<City> ctt = cities.stream().filter(ct -> ct.getName().equals(city)).findFirst();
		return ctt.isPresent() ? ctt.get() : null;
	}
	
	public void addCity(City city) {
		if(cities == null) {
			cities = new ArrayList<City>();
		}
		cities.add(city);
	}
}
