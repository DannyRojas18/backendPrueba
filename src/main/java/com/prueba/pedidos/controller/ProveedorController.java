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

import com.prueba.pedidos.service.ProveedorService;
import com.prueba.pedidos.model.Proveedor;;

@RestController
public class ProveedorController {

	@Autowired
	private ProveedorService proveedorService;

	@GetMapping("/proveedors")
	public ResponseEntity<List<Proveedor>> getAllProveedors() {
		return ResponseEntity.ok().body(this.proveedorService.getAllProveedors());
	}
	
	@GetMapping("/proveedors/{id}")
	public ResponseEntity<Proveedor> getProveedorById(@PathVariable Integer id) {
		return ResponseEntity.ok().body(this.proveedorService.getProveedorById(id));
	}

	@PostMapping("/proveedors")
	public ResponseEntity<Proveedor> createProveedor(@RequestBody Proveedor proveedor) {
		return ResponseEntity.ok().body(this.proveedorService.crearProveedor(proveedor));
	}

	@PutMapping("/proveedors/{id}")
	public ResponseEntity<Proveedor> updateProveedor(@PathVariable Integer id, @RequestBody Proveedor proveedor) {
		proveedor.setIdProveedor(id);
		return ResponseEntity.ok().body(this.proveedorService.actualizarProveedor(proveedor));
	}

	@DeleteMapping("/proveedors/{id}")
	public HttpStatus deleteProveedor(@PathVariable Integer id) {
		this.proveedorService.eliminarProveedor(id);
		return HttpStatus.OK;
	}
}
