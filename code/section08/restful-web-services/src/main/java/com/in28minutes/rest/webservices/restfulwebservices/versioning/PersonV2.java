package com.in28minutes.rest.webservices.restfulwebservices.versioning;

public class PersonV2 {

    private Name name;

    public PersonV2(Name name) {
        super();
        this.name = name;
    }

    public Name getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                "}";
    }
}
