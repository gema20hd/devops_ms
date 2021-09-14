package com.tcs.msventa.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "detalle_factura")
public class DetalleFactura implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetalle_factura;
	private int Producto_idProducto;
	private int Factura_idFactura;
	
    
	private double valor;
	private int cantidad;
	
   /* @ManyToOne( fetch=FetchType.LAZY )
    @JoinColumn(name="producto_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Producto producto;
    */

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getIdDetalle_factura() {
		return idDetalle_factura;
	}

	public void setIdDetalle_factura(int idDetalle_factura) {
		this.idDetalle_factura = idDetalle_factura;
	}

	public int getProducto_idProducto() {
		return Producto_idProducto;
	}

	public void setProducto_idProducto(int producto_idProducto) {
		Producto_idProducto = producto_idProducto;
	}

	public int getFactura_idFactura() {
		return Factura_idFactura;
	}

	public void setFactura_idFactura(int factura_idFactura) {
		Factura_idFactura = factura_idFactura;
	}


	
	

}
