package com.series.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HIGHSCHOOL")
public class HighSchool {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int school_id;

    private String school_name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "highSchool")
    private Set<Director> directors;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Student> students;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Professor> professors;

    @OneToOne(cascade = CascadeType.ALL)
    private Street street;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Telephone> phones;

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

    public Set<Student> getStudents() {
	if (students == null)
	    students = new HashSet<Student>(0);

	return students;
    }

    public String getSchool_name() {
	return school_name;
    }

    public void setSchool_name(String school_name) {
	this.school_name = school_name;
    }

    public Set<Telephone> getPhones() {
	if (phones == null)
	    phones = new HashSet<Telephone>();

	return phones;
    }
}
