package com.tatianadzn.serialization;

import java.io.*;

public class ObjectWriter {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Tom");

        File file = new File("people.bin");

        try(
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ){
            oos.writeObject(person1);
            oos.writeObject(person2);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
