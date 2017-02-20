package com.series.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STATE")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String state_name;
    
    private String state_acronym;

    private String state_shares;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "state")
    Set<City> cities;

    public String getState_name() {
	return state_name;
    }

    public String getState_shares() {
	return state_shares;
    }

    public Set<City> getCities() {
	if (cities == null)
	    cities = new HashSet<City>();

	return cities;
    }

    public void setState_name(String state_name) {
	this.state_name = state_name;
    }

    public void setState_shares(String state_shares) {
	this.state_shares = state_shares;
    }

    public String getState_acronym() {
        return state_acronym;
    }

    public void setState_acronym(String state_acronym) {
        this.state_acronym = state_acronym;
    }

}
