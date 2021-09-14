package com.tcs.msventa.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.msventa.entity.DetalleFactura;
import com.tcs.msventa.entity.Factura;
import com.tcs.msventa.entity.Producto;
import com.tcs.msventa.entity.Supermercado;
import com.tcs.msventa.repository.DetalleRepository;
import com.tcs.msventa.repository.FacturaRepository;
import com.tcs.msventa.repository.ProductoRepository;
import com.tcs.msventa.repository.SupermercadoRepository;

import net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName;

@Service
public class FacturaService {
	private List<Supermercado> supermercados;

	private Factura factura;
	private Supermercado supermercado;

	private List<Producto> productos;
	private Producto producto;

	public FacturaService() {
		factura = new Factura();
		supermercados = new ArrayList<Supermercado>();
		productos = new ArrayList<Producto>();

	}

	@Autowired
	FacturaRepository facRepository;

	@Autowired
	SupermercadoRepository supermercadoRepository;

	@Autowired
	ProductoRepository productoRepository;

	@Autowired
	DetalleRepository detalleRepository;

	public double totalVentasSupermecados(int id) {
		return facRepository.ventasSupermecados(id);

	}

	public List<Supermercado> supermercado() throws SQLException {
		return (List<Supermercado>) supermercadoRepository.findAll();

	}

	@Transactional
	public List<Producto> productos() throws SQLException {
		return (List<Producto>) productoRepository.findAll();

	}

	@Transactional
	public List<DetalleFactura> detalleFacturasF() throws SQLException {
		return detalleRepository.findAll();

	}

	@Transactional
	public List<Object[]> productoSupermercados(int id) throws SQLException {
		return productoRepository.productoSupermercados(id);
	}

	@Transactional
	public List<Object[]> ventaProducto(int id) throws SQLException {
		return detalleRepository.productoVendidoSupermercado(id);
	}
	
	@Transactional
	public List<Object[]> ventaProductoSupermercado(int id) throws SQLException {
		return detalleRepository.productoMasVendidosSuper(id);
	}
	
	public List<Object[]> productosVendidos() throws SQLException {
		return detalleRepository.productosVendidos();
	}

}
