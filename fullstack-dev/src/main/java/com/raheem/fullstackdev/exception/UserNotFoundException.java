package com.raheem.fullstackdev.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Could not find this user with id " + id);

    }
}
