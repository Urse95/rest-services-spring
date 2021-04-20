package com.example.demo.exceptions;

public class OrderNotFoundException extends RuntimeException {

    public OrderNotFoundException(Long id) {
        super("Could not find the order with id: " + id);
    }
}
