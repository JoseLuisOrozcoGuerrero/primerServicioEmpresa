package com.example.demo.service.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="tst_Cita")
public class GestionCita implements Serializable{
	
	
	/**
	 * Asocia cada clase serializable con un numero de version
	 */
	private static final long serialVersionUID=1L;
	
	//----------------------------------------------------------------
	//----------------------------------------------------------------
	//,updatable = false, nullable=false
	
//	@ManyToOne
//	@JoinColumn(name="id", nullable=false)	
//	private Empresa empresa;
	
	//----------------------------------------------------------------
	//----------------------------------------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native") 
	@GenericGenerator(name="native", strategy="native")
	private Long idcita;
	
	@Column
	private String fechaCita;
	
	/**
	 * Construtor necesario para arrancar clase
	 */
	public GestionCita() {
		
	}
	
	public GestionCita(Long idcita, String fechaCita) {
		super();
		
		this.idcita = idcita;
		this.fechaCita = fechaCita;
	}

	

	public Long getIdcita() {
		return idcita;
	}

	public void setIdcita(Long idcita) {
		this.idcita = idcita;
	}

	public String getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(String fechaCita) {
		this.fechaCita = fechaCita;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "idcita=" + idcita + ", fechaCita=" + fechaCita + "]";
	}

}
