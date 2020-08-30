package com.prueba.pedidos.service;

import java.util.List;

import com.prueba.pedidos.model.Producto;

public interface ProductoService {

	Producto crearProducto (Producto producto);
	Producto actualizarProducto (Producto producto);
	void eliminarProducto (Integer idProducto);
	
	List<Producto> getAllProductos ();
	
	Producto getProductoById (Integer idProducto);
}
