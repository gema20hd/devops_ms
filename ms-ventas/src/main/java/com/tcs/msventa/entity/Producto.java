package com.tcs.msventa.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "producto")
public class Producto implements Serializable {

	public Producto() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProducto;
	private String nombre_producto;
	private double precio;
	private String unidad;
	private String imagen_producto;
	private double stock;
	private int Supermercado_idSupermercado;
	@Transient
	private String nombreSupermercado;

	//@ManyToOne(fetch=FetchType.LAZY)
	//@JsonBackReference
	//private Supermercado Supermercado;
	
	//@OneToMany(mappedBy = "supermercado", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	//@JsonManagedReference
	//private List<Producto> productos;

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}



	public String getImagen_producto() {
		return imagen_producto;
	}

	public void setImagen_producto(String imagen_producto) {
		this.imagen_producto = imagen_producto;
	}

	public double getStock() {
		return stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}

	public int getSupermercado_idSupermercado() {
		return Supermercado_idSupermercado;
	}

	public void setSupermercado_idSupermercado(int supermercado_idSupermercado) {
		Supermercado_idSupermercado = supermercado_idSupermercado;
	}

	public String getNombreSupermercado() {
		if(Supermercado_idSupermercado==1) {
			return "Supermaxi";
		}else if(Supermercado_idSupermercado==2) {
			return "Mi comisariato";
		}
		else if(Supermercado_idSupermercado==3) {
			return "Tia";
		}
		else if(Supermercado_idSupermercado==4) {
			return "Aki";
		}
		return null;
	}

	public void setNombreSupermercado(String nombreSupermercado) {
		this.nombreSupermercado = nombreSupermercado;
	}
	

	








	
	
	
	

}
