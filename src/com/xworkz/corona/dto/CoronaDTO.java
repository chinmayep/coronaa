package com.xworkz.corona.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@Component
@Entity
@Table(name="covid_table")
public class CoronaDTO{

	
	public CoronaDTO() {
		System.out.println("created"+this.getClass().getName());
	}
	@Id
	@GenericGenerator(name= "ref", strategy="increment")
	@GeneratedValue(generator = "ref")
	private String name;
	private long id;
	private int age;
	private String email;
	private String result;
	private String state;
	
	
	
}
