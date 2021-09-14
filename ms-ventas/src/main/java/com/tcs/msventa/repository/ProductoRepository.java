package com.tcs.msventa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tcs.msventa.entity.DetalleFactura;
import com.tcs.msventa.entity.Producto;
import com.tcs.msventa.entity.Supermercado;



public interface ProductoRepository extends CrudRepository<Producto, Integer>{
	
	
	@Query("select p.idProducto, p.nombre_producto,p.precio,p.unidad,p.stock,p.Supermercado_idSupermercado from Producto p where Supermercado_idSupermercado=?1")
	List<Object[]> productoSupermercados(int id);
	


}
