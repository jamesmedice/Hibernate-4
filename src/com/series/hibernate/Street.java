package com.series.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STREET")
public class Street {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int street_id;

    private String street_name;

    private Boolean multi_directional;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "street")
    private Set<Student> students;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "street")
    private Set<Director> directors;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "street")
    private Set<Professor> professors;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "street")
    private Set<Church> churchies;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "street")
    private Set<Devout> devouts;

    public String getStreet_name() {
	return street_name;
    }

    public Boolean getMulti_directional() {
	return multi_directional;
    }

    public void setStreet_name(String street_name) {
	this.street_name = street_name;
    }

    public void setMulti_directional(Boolean multi_directional) {
	this.multi_directional = multi_directional;
    }

    public Set<Student> getStudents() {
	if (students == null)
	    students = new HashSet<Student>();

	return students;
    }

    public Set<Director> getDirectors() {
	if (directors == null)
	    directors = new HashSet<Director>();

	return directors;
    }

    public Set<Professor> getProfessors() {
	if (professors == null)
	    professors = new HashSet<Professor>();

	return professors;
    }

    public Set<Church> getChurchies() {
	if (churchies == null)
	    churchies = new HashSet<Church>();

	return churchies;
    }

    public Set<Devout> getDevouts() {
	if (devouts == null)
	    devouts = new HashSet<Devout>();

	return devouts;
    }

}
