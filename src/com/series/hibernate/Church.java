package com.series.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

enum ChuchTypes {
    CATHOLIC, APOSTOLIC, BUDDHIST, UNIVERSALISM, LUTHERAN, JUDAISM, GREEK, EPISCOPAL, PRESBYTERIAN, EVANGELICAL, JUCHE, JAIN, SHINTO, ORTHODOX;
}

@Entity
@Table(name = "CHURCH")
public class Church {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int church_id;

    private String church_name;

    private ChuchTypes churchTypes;

    @JoinColumn(name = "street_id", insertable = false, updatable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Street street;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "church")
    private Set<Devout> devouts;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Telephone> phones;

    public String getChurch_name() {
	return church_name;
    }

    public ChuchTypes getChurchTypes() {
	return churchTypes;
    }

    public Street getStreet() {
	return street;
    }

    public Set<Devout> getDevouts() {
	if (devouts == null)
	    devouts = new HashSet<Devout>();

	return devouts;
    }

    public void setChurch_name(String church_name) {
	this.church_name = church_name;
    }

    public void setChurchTypes(ChuchTypes churchTypes) {
	this.churchTypes = churchTypes;
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
