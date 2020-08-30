package com.prueba.pedidos.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class NotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NotFoundException ( String mensaje) {
		super(mensaje);
	}
	
	public NotFoundException ( String mensaje, Throwable throwable) {
		super(mensaje, throwable);
	}
	

	
}
