package com.sda.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Remigiusz Zudzin
 */
public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Jan", "Kowalski", 25);
        Person person2 = new Person("Anna", "Nowak", 30);

        ObjectMapper mapper = new ObjectMapper();
        try {
            String personStr = mapper.writeValueAsString(person1);
            System.out.println(personStr);
            // do pliku person.json zapisac wynikowego stringa
            Files.write(Paths.get("person.json"), personStr.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
