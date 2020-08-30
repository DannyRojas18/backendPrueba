package com.prueba.pedidos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.pedidos.exception.NotFoundException;
import com.prueba.pedidos.model.Pedido;
import com.prueba.pedidos.repository.PedidoRepository;

@Service
@Transactional
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;

	@Override
	public Pedido crearPedido(Pedido pedido) {
		return this.pedidoRepository.save(pedido);
	}

	@Override
	public Pedido actualizarPedido(Pedido pedido) {
		Optional<Pedido> pedidoDb = this.pedidoRepository.findById(pedido.getIdPedidos());

		if (pedidoDb.isPresent()) {
			Pedido pedidoUpdate = pedidoDb.get();
			pedidoUpdate.setIdPedidos(pedido.getIdPedidos());
			pedidoUpdate.setEstadopedido(pedido.getEstadopedido());
			pedidoUpdate.setCantidad(pedido.getCantidad());
			pedidoUpdate.setCantidad2(pedido.getCantidad2());
			pedidoUpdate.setCantidad3(pedido.getCantidad3());
			pedidoUpdate.setCantidad4(pedido.getCantidad4());
			pedidoUpdate.setProductosidproducto(pedido.getProductosidproducto());
			pedidoUpdate.setProductosidproducto1(pedido.getProductosidproducto1());
			pedidoUpdate.setProductosidproducto2(pedido.getProductosidproducto2());
			pedidoUpdate.setProductosidproducto3(pedido.getProductosidproducto3());
			pedidoUpdate.setProductosidproducto4(pedido.getProductosidproducto4());
			
			this.pedidoRepository.save(pedidoUpdate);
			return pedidoUpdate;
		} else {
			throw new NotFoundException("Pedido no encontrado con id: " + pedido.getIdPedidos());
		}
	}

	@Override
	public void eliminarPedido(Integer idPedido) {

		Optional<Pedido> pedidoDb = this.pedidoRepository.findById(idPedido);

		if (pedidoDb.isPresent()) {
			this.pedidoRepository.delete(pedidoDb.get());
		} else {
			throw new NotFoundException("Pedido no encontrado con id: " + idPedido);
		}

	}

	@Override
	public List<Pedido> getAllPedidos() {
		return this.pedidoRepository.findAll();
	}

	@Override
	public Pedido getPedidoById(Integer idPedido) {

		Optional<Pedido> pedidoDb = this.pedidoRepository.findById(idPedido);

		if (pedidoDb.isPresent()) {
			return pedidoDb.get();
		} else {
			throw new NotFoundException("Pedido no encontrado con id: " + idPedido);
		}
	}



}
