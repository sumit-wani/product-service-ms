package com.shopify.exception;

public class ResourceNotExistsException extends RuntimeException {
	
	 public ResourceNotExistsException(String msg) {
		super(msg);
	}

}
