package com.series.hibernate;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CITY")
public class City implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int city_Id;

    private String city_name;

    private long population;

    private String area_code;

    @ManyToOne(cascade = CascadeType.ALL)
    private State state;

    @OneToMany(cascade = CascadeType.ALL)
    Set<HighSchool> highSchools;

    @OneToMany(cascade = CascadeType.ALL)
    Set<Street> street;

    public String getCity_name() {
	return city_name;
    }

    public long getPopulation() {
	return population;
    }

    public String getArea_code() {
	return area_code;
    }

    public State getState() {
	return state;
    }

    public Set<Street> getStreet() {
	if (street == null)
	    street = new HashSet<Street>();
	return street;
    }

    public Set<HighSchool> getHighSchools() {
	if (highSchools == null)
	    highSchools = new HashSet<HighSchool>(0);

	return highSchools;
    }

    public void setCity_name(String city_name) {
	this.city_name = city_name;
    }

    public void setPopulation(long population) {
	this.population = population;
    }

    public void setArea_code(String area_code) {
	this.area_code = area_code;
    }

}
