package com.tatianadzn.serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return id + " : " + name;
    }
}
