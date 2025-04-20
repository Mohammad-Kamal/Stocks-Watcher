package com.mohammadkamal.stockwatcher.exception;

import jakarta.validation.constraints.Email;

public class ResourceAlreadyExistException extends RuntimeException {
    public ResourceAlreadyExistException(String messaege) {
        super(messaege);
    }

    public ResourceAlreadyExistException(String message, Throwable cause){
        super(message, cause);
    }
}
