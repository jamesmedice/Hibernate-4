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

@Entity
@Table(name = "DEVOUT")
public class Devout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int devout_id;

    private String name;

    @JoinColumn(name = "street_id", insertable = false, updatable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Street street;

    @JoinColumn(name = "church_id", insertable = false, updatable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Church church;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Telephone> phones;

    public String getName() {
	return name;
    }

    public Street getStreet() {
	return street;
    }

    public Church getChurch() {
	return church;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setStreet(Street street) {
	this.street = street;
    }

    public void setChurch(Church church) {
	this.church = church;
    }

    public Set<Telephone> getPhones() {
	if (phones == null)
	    phones = new HashSet<Telephone>();

	return phones;
    }
}
