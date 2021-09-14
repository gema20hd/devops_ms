package com.tcs.msventa.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.msventa.entity.Factura;
import com.tcs.msventa.entity.Producto;
import com.tcs.msventa.entity.Supermercado;


public interface FacturaRepository extends CrudRepository<Factura, Integer>{
   //@Query("SELECT t FROM Transaction t WHERE t.ibanAccount = ?1")
    @Query("SELECT  SUM(total) FROM Factura where Supermercado_idSupermercado =?1 ")
    public double ventasSupermecados(int id);
    
    //@Query("SELECT idSupermercado,nombre_supermercado  FROM Supermercado ")
    //public List<Supermercado> supermecados();
    
   // @Query("select cantidad, valor, (cantidad*valor) as valorTotal from detalle_factura where Producto_idProducto  in (select idProducto from producto where Supermercado_idSupermercado = 2); ")
   // public List<Producto> productoVendidosSupermecado();
 
    

}
