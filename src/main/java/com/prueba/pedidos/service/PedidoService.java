package com.prueba.pedidos.service;

import java.util.List;

import com.prueba.pedidos.model.Pedido;

public interface PedidoService {
	
	Pedido crearPedido (Pedido pedido);
	Pedido actualizarPedido (Pedido pedido);
	void eliminarPedido (Integer idPedido);
	
	List<Pedido> getAllPedidos ();
	
	Pedido getPedidoById (Integer idPedido);
	
}