package com.series.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TELEPHONE")
public class Telephone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String telephone_number;

    private int area_code;

    public String getTelephone_number() {
	return telephone_number;
    }

    public int getArea_code() {
	return area_code;
    }

    public void setTelephone_number(String telephone_number) {
	this.telephone_number = telephone_number;
    }

    public void setArea_code(int area_code) {
	this.area_code = area_code;
    }

}
