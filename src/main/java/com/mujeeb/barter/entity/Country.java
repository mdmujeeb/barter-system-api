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
public class Country {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private List<State> states;

    protected Country() {
    }

    public Country(String name, List<State> states) {
        this.name = name;
        this.states = states;
    }

    @Override
    public String toString() {
        return "NamazTime{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", states=" + states +
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

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}
	
	public State findStateByName(String state) {
		
		Optional<State> stt = states.stream().filter(st -> st.getName().equals(state)).findFirst();
		return stt.isPresent() ? stt.get() : null;
	}
	
	public void addState(State state) {
		if(states == null) {
			states = new ArrayList<State>();
		}
		states.add(state);
	}
}
