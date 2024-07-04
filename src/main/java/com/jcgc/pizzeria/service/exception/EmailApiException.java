package com.jcgc.pizzeria.service.exception;

public class EmailApiException extends RuntimeException {

    public EmailApiException() {
        super("Error sending email...");
    }
}
