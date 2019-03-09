package com.sda.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Remigiusz Zudzin
 */
public class Main {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        Student student1 = new Student("Jan", "Kowalski", new Address("Bydgoszcz", "Dluga 9"));
        Student student2 = new Student("Tomasz", "Nowak", new Address("Warszawa", "Luzycka 1"));
        Student student3 = new Student("Anna", "Jakas", new Address("Lodz", "Biedna 2"));

        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);

        //zapisywanie listy studentow do json
        try {
            String studentsStr = mapper.writeValueAsString(listOfStudents);
            System.out.println(studentsStr);
            Files.write(Paths.get("studentList.json"), studentsStr.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        Person person1 = new Person("Jan", "Kowalski", 25);
        Person person2 = new Person("Anna", "Nowak", 30);
        Person person3 = new Person("Tomasz", "Costam", 30);
        Person person4 = new Person("Remigiusz", "Zudzin", 30);

        //zapisywanie jednego obiektu typu Person do json
        try {
            String personStr = mapper.writeValueAsString(person1);
            System.out.println(personStr);
            // do pliku person.json zapisac wynikowego stringa
            Files.write(Paths.get("person.json"), personStr.getBytes());
            mapper.writeValue(new File("person2.json"), person1); // <- druga metoda
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Person> listOfPeople = new ArrayList<>();
        listOfPeople.add(person1);
        listOfPeople.add(person2);
        listOfPeople.add(person3);
        listOfPeople.add(person4);

        // zapisanie listy ludzi do formatu json
        try {
            String peopleStr = mapper.writeValueAsString(listOfPeople);
            Files.write(Paths.get("peopleList.json"), peopleStr.getBytes());

            Person[] personArray = mapper.readValue(new File("peopleList.json"), Person[].class);

            List<Person> personList = Arrays.asList(personArray);

            System.out.println(peopleStr);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
