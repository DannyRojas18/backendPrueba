package com.prueba.pedidos.service;

import java.util.List;

import com.prueba.pedidos.model.Proveedor;

public interface ProveedorService {
	
	Proveedor crearProveedor (Proveedor proveedor);
	Proveedor actualizarProveedor (Proveedor proveedor);
	void eliminarProveedor (Integer idProveedor);
	
	List<Proveedor> getAllProveedors ();
	
	Proveedor getProveedorById (Integer idProveedor);

}
