package com.codecool.hashmap;

public class KeyAlreadyExistsError extends Error {

    public KeyAlreadyExistsError() {
    }

    public KeyAlreadyExistsError(String message) {
        super(message);
    }
}
