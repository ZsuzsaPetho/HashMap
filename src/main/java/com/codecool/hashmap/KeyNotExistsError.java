package com.codecool.hashmap;

public class KeyNotExistsError extends Error {

    public KeyNotExistsError() {
    }

    public KeyNotExistsError(String message) {
        super(message);
    }
}
