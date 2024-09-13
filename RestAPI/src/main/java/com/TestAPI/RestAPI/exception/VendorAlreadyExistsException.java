package com.TestAPI.RestAPI.exception;

public class VendorAlreadyExistsException extends RuntimeException {
	private String message;
	
    public VendorAlreadyExistsException() {}

    public VendorAlreadyExistsException(String msg) {
        super(msg);
        this.message = msg;
    }

}
