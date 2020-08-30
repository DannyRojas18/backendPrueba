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

import com.prueba.pedidos.service.PedidoService;
import com.prueba.pedidos.model.Pedido;

@RestController
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;

	@GetMapping("/pedidos")
	public ResponseEntity<List<Pedido>> getAllPedidos() {
		return ResponseEntity.ok().body(this.pedidoService.getAllPedidos());
	}
	
	@GetMapping("/pedidos/{id}")
	public ResponseEntity<Pedido> getPedidoById(@PathVariable Integer id) {
		return ResponseEntity.ok().body(this.pedidoService.getPedidoById(id));
	}

	@PostMapping("/pedidos")
	public ResponseEntity<Pedido> createPedido(@RequestBody Pedido pedido) {
		return ResponseEntity.ok().body(this.pedidoService.crearPedido(pedido));
	}

	@PutMapping("/pedidos/{id}")
	public ResponseEntity<Pedido> updatePedido(@PathVariable Integer id, @RequestBody Pedido pedido) {
		pedido.setIdPedidos(id);
		return ResponseEntity.ok().body(this.pedidoService.actualizarPedido(pedido));
	}

	@DeleteMapping("/pedidos/{id}")
	public HttpStatus deletePedido(@PathVariable Integer id) {
		this.pedidoService.eliminarPedido(id);
		return HttpStatus.OK;
	}
}
