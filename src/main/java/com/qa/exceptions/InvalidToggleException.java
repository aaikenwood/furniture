package com.qa.exceptions;

public class InvalidToggleException extends Exception{
    public InvalidToggleException() {
        super("This toggle is already in that state");
    }

    public InvalidToggleException(String customMessage) {
        super(customMessage);
    }
}
