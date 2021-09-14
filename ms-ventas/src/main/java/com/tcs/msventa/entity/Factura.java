package com.tcs.msventa.entity;

import java.io.Serializable;
import java.sql.Date;
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.annotations.JoinColumnsOrFormulas;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "factura")

public class Factura implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idFactura;
	private double total;
	private double subtotal;
	private Date fecha;
	private String metodo_pago;

	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name="factura_id")
	private Supermercado supermercado;
	/*
	 * // Relacion ManyToMany (Un usuario tiene muchos perfiles) // Por defecto
	 * Fetch es FetchType.LAZY
	 * 
	 * @ManyToMany(fetch = FetchType.EAGER)
	 * 
	 * @JoinTable(name = "detalle_factura", // tabla intermedia joinColumns
	 * = @JoinColumn(name = "Factura_idFactura"), // foreignKey en la tabla de
	 * detalle inverseJoinColumns = @JoinColumn(name = "Producto_idProducto") //
	 * foreignKey en la tabla de detalle-- ) private List<Producto> productos;
	 * 
	 */
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)	
	@JoinColumn(name="factura_id")
	private List<DetalleFactura> detalleFacturas;
	
	@Transient
	private double totalSuperMercado;

	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getMetodo_pago() {
		return metodo_pago;
	}

	public void setMetodo_pago(String metodo_pago) {
		this.metodo_pago = metodo_pago;
	}

	public double getTotalSuperMercado() {
		return totalSuperMercado;
	}

	public void setTotalSuperMercado(double totalSuperMercado) {
		this.totalSuperMercado = totalSuperMercado;
	}

	public Supermercado getSupermercado() {
		return supermercado;
	}

	public void setSupermercado(Supermercado supermercado) {
		this.supermercado = supermercado;
	}

	public List<DetalleFactura> getDetalleFacturas() {
		return detalleFacturas;
	}

	public void setDetalleFacturas(List<DetalleFactura> detalleFacturas) {
		this.detalleFacturas = detalleFacturas;
	}
	
	
	
	

}
