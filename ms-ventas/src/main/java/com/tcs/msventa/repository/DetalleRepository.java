package com.tcs.msventa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tcs.msventa.entity.DetalleFactura;
import com.tcs.msventa.entity.Supermercado;

public interface DetalleRepository extends JpaRepository<DetalleFactura, Integer> {

	
	// @Query(value = "select df.nombre, df.precio from Producto df",nativeQuery = true)
	//@Query("SELECT idSupermercado,nombre_supermercado  FROM Supermercado ")
	@Query("SELECT df.Producto_idProducto,df.cantidad, df.valor,df.Factura_idFactura FROM DetalleFactura df WHERE Producto_idProducto=?1")
	List<Object[]> productoVendidoSupermercado( int id);
	@Query(value = "select df.Factura_idFactura,Producto_idProducto, df.cantidad, df.valor FROM detalle_factura df where Producto_idProducto  in (select idProducto from producto where Supermercado_idSupermercado = ?1)",nativeQuery = true)
	List<Object[]> productoMasVendidosSuper( int id);
	
	@Query(value = "SELECT p.nombre_producto, SUM(df.cantidad) as cantidad,valor ,(valor*cantidad) as precioFinal,s.nombre_supermercado\r\n"
			+ "FROM factura f, detalle_factura df, producto p, supermercado s  \r\n"
			+ "where df.Factura_idFactura=f.idFactura \r\n"
			+ "and df.Producto_idProducto=p.idProducto\r\n"
			+ "and f.Supermercado_idSupermercado=s.idSupermercado \r\n"
			+ "group by p.idProducto,s.idSupermercado",nativeQuery = true)
	List<Object[]> productosVendidos();

}
