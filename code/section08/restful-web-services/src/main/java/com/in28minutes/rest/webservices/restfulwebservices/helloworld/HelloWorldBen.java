package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBen {

    private String message;

    public HelloWorldBen(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "{" +
                " message='" + getMessage() + "'" +
                "}";
    }
}
