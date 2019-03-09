package com.sda.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author Remigiusz Zudzin
 */
public class MainLopatologicznie {


    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", 25);
        Person person2 = new Person("Tomasz", "Nowak", 20);

        ObjectMapper mapper = new ObjectMapper();


        try {
            List<Person> personList = Arrays.asList(person1, person2);
            File personListFile = new File("personListFile.json");
            mapper.writeValue(personListFile, personList);

            Person[] personArray = mapper.readValue(personListFile, Person[].class);
            System.out.println(personArray[0].toString());

        } catch (IOException e) {
//            e.printStackTrace();
        }
    }

}
