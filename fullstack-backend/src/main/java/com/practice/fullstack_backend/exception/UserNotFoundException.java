package com.practice.fullstack_backend.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(long id) {

        super("User ID " + id + " not found");
    }

}
