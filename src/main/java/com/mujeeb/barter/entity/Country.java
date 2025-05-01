package com.mujeeb.barter.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @OneToMany(targetEntity = State.class)
    @JoinColumn(name="id")
    private List<Long> stateIds;

    protected Country() {
    }

    public Country(String name, List<Long> stateIds) {
        this.name = name;
        this.stateIds = stateIds;
    }

    @Override
    public String toString() {
        return "NamazTime{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stateIds=" + stateIds +
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

	public List<Long> getStateIds() {
		return stateIds;
	}

	public void setStateIds(List<Long> stateIds) {
		this.stateIds = stateIds;
	}
	

	public void addStateId(Long stateId) {
		if(stateIds == null) {
			stateIds = new ArrayList<Long>();
		}
		stateIds.add(stateId);
	}
}
