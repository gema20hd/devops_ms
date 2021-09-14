package com.tcs.msventa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "supermercado")
public class Supermercado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSupermercado;
	private String nombre_supermercado;
	private String cuenta_bancaria;
	private String imagen_supermercado;
	

	@OneToMany(mappedBy = "supermercado", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<Factura> facturas;
	//private List<Producto> productos;
	
	//@OneToMany(mappedBy = "supermercado", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	//@JsonManagedReference
	//private List<Producto> productos;

	public int getIdSupermercado() {
		return idSupermercado;
	}

	public void setIdSupermercado(int idSupermercado) {
		this.idSupermercado = idSupermercado;
	}

	public String getNombre_supermercado() {
		return nombre_supermercado;
	}

	public void setNombre_supermercado(String nombre_supermercado) {
		this.nombre_supermercado = nombre_supermercado;
	}

	public String getCuenta_bancaria() {
		return cuenta_bancaria;
	}

	public void setCuenta_bancaria(String cuenta_bancaria) {
		this.cuenta_bancaria = cuenta_bancaria;
	}

	
	public String getImagen_supermercado() {
		return imagen_supermercado;
	}

	public void setImagen_supermercado(String imagen_supermercado) {
		this.imagen_supermercado = imagen_supermercado;
	}

	

}
