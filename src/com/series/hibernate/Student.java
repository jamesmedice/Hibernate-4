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
@Table(name = "STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;

    private String student_name;

    private String student_mobile;

    private int student_level;

    public Student() {

    }

    public Student(int student_id, String student_name) {
	super();
	this.student_id = student_id;
	this.student_name = student_name;
    }

    @JoinColumn(name = "street_id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Street street;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private Set<StudentContact> studentContact;

    @JoinColumn(name = "address_id", nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private StudentAddress studentAddress;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Professor> professors;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Telephone> phones;

    public StudentAddress getStudentAddress() {
	return studentAddress;
    }

    public void setStudentAddress(StudentAddress studentAddress) {
	this.studentAddress = studentAddress;
    }

    public Set<StudentContact> getStudentContact() {
	if (studentContact == null)
	    studentContact = new HashSet<>(0);

	return studentContact;
    }

    public int getStudent_id() {
	return student_id;
    }

    public void setStudent_id(int student_id) {
	this.student_id = student_id;
    }

    public String getStudent_name() {
	return student_name;
    }

    public void setStudent_name(String student_name) {
	this.student_name = student_name;
    }

    public String getStudent_mobile() {
	return student_mobile;
    }

    public int getStudent_level() {
	return student_level;
    }

    public void setStudent_mobile(String student_mobile) {
	this.student_mobile = student_mobile;
    }

    public void setStudent_level(int student_level) {
	this.student_level = student_level;
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
