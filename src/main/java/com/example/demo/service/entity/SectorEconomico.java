package com.example.demo.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="tst_sectoreconomico")
public class SectorEconomico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native") 
	@GenericGenerator(name="native", strategy="native")
	private Long iddepartment;

	@Column
	private String name;
	
	
	public SectorEconomico() {
		
	}


	public SectorEconomico(Long iddepartment, String name) {
		super();
		this.iddepartment = iddepartment;
		this.name = name;
	}


	public Long getIddepartment() {
		return iddepartment;
	}


	public void setIddepartment(Long iddepartment) {
		this.iddepartment = iddepartment;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "SectorEconomico [iddepartment=" + iddepartment + ", name=" + name + "]";
	}

}
