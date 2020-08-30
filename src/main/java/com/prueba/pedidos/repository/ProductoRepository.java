package com.prueba.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.pedidos.model.Producto;

public interface ProductoRepository extends JpaRepository <Producto, Integer> {
	
	
	
}
