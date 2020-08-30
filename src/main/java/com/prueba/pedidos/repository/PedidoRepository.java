package com.prueba.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.pedidos.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

	
	
}
