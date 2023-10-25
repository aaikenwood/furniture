package com.qa.exceptions;

public class InvalidTimeException extends Exception{
    public InvalidTimeException() {
        super("The time is invalid");
    }

    public InvalidTimeException(String customMessage) {
        super(customMessage);
    }
}
