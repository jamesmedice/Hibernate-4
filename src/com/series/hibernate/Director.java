package com.series.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DIRECTOR")
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int level;

    private String name;

    @JoinColumn(name = "school_id")
    @ManyToOne(cascade = CascadeType.ALL)
    private HighSchool highSchool;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Professor> professors;

    @JoinColumn(name = "street_id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Street street;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Telephone> phones;

    public int getLevel() {
	return level;
    }

    public String getName() {
	return name;
    }

    public HighSchool getHighSchool() {
	return highSchool;
    }

    public void setLevel(int level) {
	this.level = level;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setHighSchool(HighSchool highSchool) {
	this.highSchool = highSchool;
    }

    public Set<Professor> getProfessors() {
	if (professors == null)
	    professors = new HashSet<Professor>();

	return professors;
    }

    public Street getStreet() {
	return street;
    }

    public void setStreet(Street street) {
	this.street = street;
    }

    public Set<Telephone> getPhones() {
	if (phones == null)
	    phones = new HashSet<Telephone>();

	return phones;
    }
}
