package com.prueba.pedidos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.pedidos.exception.NotFoundException;
import com.prueba.pedidos.model.Producto;
import com.prueba.pedidos.repository.ProductoRepository;

@Service
@Transactional
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public Producto crearProducto(Producto producto) {
		return this.productoRepository.save(producto);
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		Optional<Producto> productoDb = this.productoRepository.findById(producto.getIdProducto());

		if (productoDb.isPresent()) {
			Producto productoUpdate = productoDb.get();
			productoUpdate.setIdProducto(producto.getIdProducto());
			productoUpdate.setRefProducto(producto.getRefProducto());
			productoUpdate.setNombreProducto(producto.getNombreProducto());
			this.productoRepository.save(productoUpdate);
			return productoUpdate;
		} else {
			throw new NotFoundException("Producto no encontrado con id: " + producto.getIdProducto());
		}
	}

	@Override
	public void eliminarProducto(Integer idProducto) {

		Optional<Producto> productoDb = this.productoRepository.findById(idProducto);

		if (productoDb.isPresent()) {
			this.productoRepository.delete(productoDb.get());
		} else {
			throw new NotFoundException("Producto no encontrado con id: " + idProducto);
		}

	}

	@Override
	public List<Producto> getAllProductos() {
		return this.productoRepository.findAll();
	}

	@Override
	public Producto getProductoById(Integer idProducto) {

		Optional<Producto> productoDb = this.productoRepository.findById(idProducto);

		if (productoDb.isPresent()) {
			return productoDb.get();
		} else {
			throw new NotFoundException("Producto no encontrado con id: " + idProducto);
		}
	}

}
