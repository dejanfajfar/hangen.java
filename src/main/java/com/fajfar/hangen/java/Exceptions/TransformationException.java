package com.fajfar.hangen.java.Exceptions;

public class TransformationException extends Exception {

    public TransformationException(String message){
        super(message);
    }

    public TransformationException(String massage, Exception innerException){
        super(massage, innerException);
    }

    public TransformationException(Exception exception){
        super(exception.getMessage(), exception);
    }
}
