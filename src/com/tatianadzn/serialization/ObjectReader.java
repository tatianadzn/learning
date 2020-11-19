package com.tatianadzn.serialization;

import java.io.*;

public class ObjectReader {
    public static void main(String[] args) {
        File file = new File("people.bin");
         try(
                 FileInputStream fis = new FileInputStream(file);
                 ObjectInputStream ois = new ObjectInputStream(fis)
         ){
             Person person1 = (Person)ois.readObject();
             Person person2 = (Person)ois.readObject();

             System.out.println(person1);
             System.out.println(person2);
         } catch (IOException | ClassNotFoundException e){
             e.printStackTrace();
         }
    }
}
