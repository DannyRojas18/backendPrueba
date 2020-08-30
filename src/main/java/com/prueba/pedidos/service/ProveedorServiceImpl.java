package com.prueba.pedidos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.pedidos.exception.NotFoundException;
import com.prueba.pedidos.model.Proveedor;
import com.prueba.pedidos.repository.ProveedorRepository;

@Service
@Transactional
public class ProveedorServiceImpl implements ProveedorService {

	@Autowired
	private ProveedorRepository proveedorRepository;

	@Override
	public Proveedor crearProveedor(Proveedor proveedor) {
		return this.proveedorRepository.save(proveedor);
	}

	@Override
	public Proveedor actualizarProveedor(Proveedor proveedor) {
		Optional<Proveedor> proveedorDb = this.proveedorRepository.findById(proveedor.getIdProveedor());

		if (proveedorDb.isPresent()) {
			Proveedor proveedorUpdate = proveedorDb.get();
			proveedorUpdate.setIdProveedor(proveedor.getIdProveedor());
			proveedorUpdate.setNombreProveedor(proveedor.getNombreProveedor());
			proveedorUpdate.setTipoDocumentoProveedor(proveedor.getTipoDocumentoProveedor());
			proveedorUpdate.setNumDocumentoProveedor(proveedor.getNumDocumentoProveedor());
			this.proveedorRepository.save(proveedorUpdate);
			return proveedorUpdate;
		} else {
			throw new NotFoundException("Proveedor no encontrado con id: " + proveedor.getIdProveedor());
		}
	}

	@Override
	public void eliminarProveedor(Integer idProveedor) {

		Optional<Proveedor> proveedorDb = this.proveedorRepository.findById(idProveedor);

		if (proveedorDb.isPresent()) {
			this.proveedorRepository.delete(proveedorDb.get());
		} else {
			throw new NotFoundException("Proveedor no encontrado con id: " + idProveedor);
		}

	}

	@Override
	public List<Proveedor> getAllProveedors() {
		return this.proveedorRepository.findAll();
	}

	@Override
	public Proveedor getProveedorById(Integer idProveedor) {

		Optional<Proveedor> proveedorDb = this.proveedorRepository.findById(idProveedor);

		if (proveedorDb.isPresent()) {
			return proveedorDb.get();
		} else {
			throw new NotFoundException("Proveedor no encontrado con id: " + idProveedor);
		}
	}

}
