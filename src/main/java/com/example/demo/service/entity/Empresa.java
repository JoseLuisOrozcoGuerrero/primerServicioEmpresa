package com.example.demo.service.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tst_empresa")
public class Empresa implements Serializable{

	private static final long serialVersionUID=1L;
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@GenericGenerator(name="native",strategy="native")
	private long id;
	//----------------------------------------------------------------
	//----------------------------------------------------------------
	//@JsonIgnore
	@JoinColumn(name="id_empresa")
	@OneToMany(fetch =FetchType.LAZY, cascade = CascadeType.ALL)
	private List<GestionCita> gesCit;
	//----------------------------------------------------------------
	//----------------------------------------------------------------
	
	@ManyToOne
    @JoinColumn(name = "iddepartment")
    private SectorEconomico secEc;
	
	@Column
	private String nombre;
	
	public Empresa() {
		
	}
	
	public Empresa(List<GestionCita> gesCit, SectorEconomico secEc, long id, String nombre) {
		super();
		this.gesCit = gesCit;
		this.secEc = secEc;
		this.id = id;
		this.nombre = nombre;
	}
	
	public List<GestionCita> getGesCit() {
		return gesCit;
	}

	public void setGesCit(List<GestionCita> gesCit) {
		this.gesCit = gesCit;
	}

	public SectorEconomico getSecEc() {
		return secEc;
	}

	public void setSecEc(SectorEconomico secEc) {
		this.secEc = secEc;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Empresa [gesCit=" + gesCit + ", secEc=" + secEc + ", id=" + id + ", nombre=" + nombre + "]";
	}
	
}
