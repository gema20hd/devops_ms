package com.tcs.msventa;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.msventa.entity.DetalleFactura;
import com.tcs.msventa.entity.Producto;
import com.tcs.msventa.entity.Supermercado;
import com.tcs.msventa.service.FacturaService;




@RestController
public class Controlador {

	
	@Autowired
	FacturaService facturaService;


	@GetMapping(path = "/detalleFactura/")
	public List<DetalleFactura> detalleFactura() throws SQLException {
		return  facturaService.detalleFacturasF();
	}
	
	@GetMapping(path = "/productos/")
	public List<Producto> productos() throws SQLException {
		return  facturaService.productos();
	}
	
	@GetMapping(path = "/supermercado/")
	public List<Supermercado> Supermercado() throws SQLException {
		return  facturaService.supermercado();
	}
	

	@GetMapping(path = "/venta/supermercado/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public double ventaPorSupermercado(@PathVariable("id") Integer id) {
		return (double) this.facturaService.totalVentasSupermecados(id);
	}


	@GetMapping(path = "/venta/supermaxi")
	@Produces(MediaType.APPLICATION_JSON)
	public double ventaSupermaxi() {
		return (double) this.facturaService.totalVentasSupermecados(1);
	}

	@GetMapping(path = "/venta/comisariato")
	@Produces(MediaType.APPLICATION_JSON)
	public double ventaComisariato() {
		return (double) this.facturaService.totalVentasSupermecados(2);
	}

	@GetMapping(path = "/venta/tia")
	@Produces(MediaType.APPLICATION_JSON)
	public double ventaTia() {
		return (double) this.facturaService.totalVentasSupermecados(3);
	}

	@GetMapping(path = "/venta/aki")
	@Produces(MediaType.APPLICATION_JSON)
	public double ventaAki() {
		return (double) this.facturaService.totalVentasSupermecados(4);
	}

	@GetMapping(path = "/producto/supermercado/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Object[]> productoPorSupermercado(@PathVariable("id") Integer id) throws SQLException {
		return  this.facturaService.productoSupermercados(id);
	}


	@GetMapping(path = "/venta/producto/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Object[]> ventaPorProducto(@PathVariable("id") Integer id) throws SQLException {
		return  this.facturaService.ventaProducto(id);
	}
	
	//query de Edison
	
	@GetMapping(path = "/venta/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Object[]> ventaPorProductoSupermercado(@PathVariable("id") Integer id) throws SQLException {
		return  this.facturaService.ventaProductoSupermercado(id);
	}
	
	//venta de los producto de los supermcados
	@GetMapping(path = "/venta/supermercados/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Object[]> ventaSupermercado() throws SQLException {
		return  this.facturaService.productosVendidos();
	}

	
}
