package com.series.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENTCONTACT")
public class StudentContact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_contact_id;

    private String contact_type;

    private String contact_detail;

    @JoinColumn(name="student_id", nullable=false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Student student;

    public String getContact_type() {
	return contact_type;
    }

    public String getContact_detail() {
	return contact_detail;
    }

    public void setContact_type(String contact_type) {
	this.contact_type = contact_type;
    }

    public void setContact_detail(String contact_detail) {
	this.contact_detail = contact_detail;
    }

    public Student getStudent() {
	return student;
    }

    public void setStudent(Student student) {
	this.student = student;
    }
}
