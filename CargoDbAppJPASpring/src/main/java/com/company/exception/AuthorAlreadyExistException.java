package com.company.exception;

public class AuthorAlreadyExistException extends RuntimeException {

    public AuthorAlreadyExistException() {
        super();
    }

    public AuthorAlreadyExistException(String message) {
        super(message);
    }

}
