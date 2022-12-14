package com.demo.itx.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Requested bodega does not exist")
public class BodegaNotFoundException extends RuntimeException {
	public BodegaNotFoundException(String message) {
		super(message);
	}
}
