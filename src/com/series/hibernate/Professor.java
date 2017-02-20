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
@Table(name = "PROFESSOR")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private int experience;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Director> directors;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "professors")
    private Set<Student> students;

    @JoinColumn(name = "street_id", insertable = false, updatable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Street street;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Telephone> phones;

    public String getTitle() {
	return title;
    }

    public int getExperience() {
	return experience;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public void setExperience(int experience) {
	this.experience = experience;
    }

    public Set<Director> getDirectors() {
	if (directors == null)
	    directors = new HashSet<Director>();

	return directors;
    }

    public Set<Student> getStudents() {
	if (students == null)
	    students = new HashSet<Student>();

	return students;
    }

    public Street getStreet() {
	return street;
    }

    public void setStreet(Street street) {
	this.street = street;
    }

    public Set<Telephone> getPhones() {
	if (phones == null)
	    phones = new HashSet<>();

	return phones;
    }
}
