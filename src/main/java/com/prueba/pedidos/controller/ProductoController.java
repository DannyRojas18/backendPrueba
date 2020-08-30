package com.prueba.pedidos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.pedidos.service.ProductoService;
import com.prueba.pedidos.model.Producto;;

@RestController
public class ProductoController {

	@Autowired
	private ProductoService productoService;

	@GetMapping("/productos")
	public ResponseEntity<List<Producto>> getAllProductos() {
		return ResponseEntity.ok().body(this.productoService.getAllProductos());
	}
	
	@GetMapping("/productos/{id}")
	public ResponseEntity<Producto> getProductoById(@PathVariable Integer id) {
		return ResponseEntity.ok().body(this.productoService.getProductoById(id));
	}

	@PostMapping("/productos")
	public ResponseEntity<Producto> createProducto(@RequestBody Producto producto) {
		return ResponseEntity.ok().body(this.productoService.crearProducto(producto));
	}

	@PutMapping("/productos/{id}")
	public ResponseEntity<Producto> updateProducto(@PathVariable Integer id, @RequestBody Producto producto) {
		producto.setIdProducto(id);
		return ResponseEntity.ok().body(this.productoService.actualizarProducto(producto));
	}

	@DeleteMapping("/productos/{id}")
	public HttpStatus deleteProducto(@PathVariable Integer id) {
		this.productoService.eliminarProducto(id);
		return HttpStatus.OK;
	}
}
