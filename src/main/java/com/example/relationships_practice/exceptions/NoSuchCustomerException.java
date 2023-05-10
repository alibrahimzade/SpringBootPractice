package com.example.relationships_practice.exceptions;

public class NoSuchCustomerException extends RuntimeException{
    public NoSuchCustomerException(String message) {
        super(message);
    }
}
