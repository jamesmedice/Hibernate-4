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
@Table(name = "STUDENTADDRESS")
public class StudentAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int address_id;

    private String address;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentAddress")
    private Set<Student> students = new HashSet<Student>(0);

    public Set<Student> getStudents() {
	return students;
    }

    public void setStudents(Set<Student> students) {
	this.students = students;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }
}
