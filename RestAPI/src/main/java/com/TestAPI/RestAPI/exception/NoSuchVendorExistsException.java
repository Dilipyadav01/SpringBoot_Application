package com.TestAPI.RestAPI.exception;

public class NoSuchVendorExistsException extends RuntimeException{
	private String message;

    public NoSuchVendorExistsException() {}

    public NoSuchVendorExistsException(String msg) {
        super(msg);
        this.message = msg;
    }

}
