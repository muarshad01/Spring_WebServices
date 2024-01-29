package com.in28minutes.rest.webservices.restfulwebservices.versioning;

public class Name {

    private String firstName;
    private String secondName;

    public Name(String firstName, String secondName) {
        super();
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    @Override
    public String toString() {
        return "{" +
                " firstName='" + getFirstName() + "'" +
                ", secondName='" + getSecondName() + "'" +
                "}";
    }
}
