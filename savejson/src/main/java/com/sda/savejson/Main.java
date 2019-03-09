package com.sda.savejson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.json.Address;
import com.sda.json.Person;
import com.sda.json.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Remigiusz Zudzin
 */
public class Main {

    static ObjectMapper mapper = new ObjectMapper();

    public static void createPerson() {
        Person person1 = new Person("Remigiusz", "Zudzin", 26);

        try {
            //Zapisujemy instancję person1 jako JSON
            mapper.writeValue(new File("person.json"), person1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createPersonsList(){
        Person person1 = new Person("Jan", "Kowalski", 25);
        Person person2 = new Person("Anna", "Nowak", 30);
        Person person3 = new Person("Tomasz", "Costam", 30);
        Person person4 = new Person("Remigiusz", "Zudzin", 30);

        List<Person> peopleList = new ArrayList<>();
        peopleList.add(person1);
        peopleList.add(person2);
        peopleList.add(person3);
        peopleList.add(person4);

        try {
            mapper.writeValue(new File("peopleList.json"), peopleList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createStudentList(){
        Student student1 = new Student("Jan", "Kowalski", new Address("Bydgoszcz", "Dluga 9"));
        Student student2 = new Student("Tomasz", "Nowak", new Address("Warszawa", "Luzycka 1"));
        Student student3 = new Student("Anna", "Jakas", new Address("Lodz", "Biedna 2"));
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);

        try {
            //zapisujemy listę do JSONa
            mapper.writeValue(new File("studentList.json"), listOfStudents);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        createPerson();
        createPersonsList();
        createStudentList();
    }

}
