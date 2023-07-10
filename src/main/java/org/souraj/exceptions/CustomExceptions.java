package org.souraj.exceptions;

public class CustomExceptions extends RuntimeException{

    public CustomExceptions() {
        super();
    }

    public CustomExceptions(String message){
        super(message);
    }
}
