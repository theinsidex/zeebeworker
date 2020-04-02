package com.worker.orderworker.exception;

public class ParameterNotFoundException extends RuntimeException {
    public ParameterNotFoundException(String message){
        super(message);
    }


}
