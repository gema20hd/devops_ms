package com.tcs.msventa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tcs.msventa.entity.Supermercado;


public interface SupermercadoRepository extends CrudRepository<Supermercado, Integer>{
	
	@Query("SELECT idSupermercado,nombre_supermercado  FROM Supermercado ")
	List<Supermercado> supermercado();

}
