package com.qa.exceptions;

public class DangerousSpeedException extends Exception{
    public DangerousSpeedException() {
        super("This speed is DANGEROUS!! :(");
    }

    public DangerousSpeedException(String customMessage) {
        super(customMessage);
    }
}
