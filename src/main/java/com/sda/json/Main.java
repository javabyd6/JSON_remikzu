package com.sda.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Remigiusz Zudzin
 */
public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Jan", "Kowalski", 25);
        Person person2 = new Person("Anna", "Nowak", 30);
        Person person3 = new Person("Tomasz", "Costam", 30);
        Person person4 = new Person("Remigiusz", "Zudzin", 30);

        ObjectMapper mapper = new ObjectMapper();
        try {
            String personStr = mapper.writeValueAsString(person1);
            System.out.println(personStr);
            // do pliku person.json zapisac wynikowego stringa
            Files.write(Paths.get("person.json"), personStr.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Person> listOfPeople = new ArrayList<>();
        listOfPeople.add(person1);
        listOfPeople.add(person2);
        listOfPeople.add(person3);
        listOfPeople.add(person4);

        ObjectMapper mapper2 = new ObjectMapper();

        try {
            String peopleStr = mapper2.writeValueAsString(listOfPeople);
            System.out.println(peopleStr);
            Files.write(Paths.get("peopleList.json"), peopleStr.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
