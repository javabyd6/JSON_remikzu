package com.sda.readjson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.json.Person;
import com.sda.json.Student;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author Remigiusz Zudzin
 */
public class Main {

    static ObjectMapper mapper = new ObjectMapper();

    public static void readPerson() {
        try {
            Person personRead = mapper.readValue(new File("person.json"), Person.class);
            System.out.println(personRead.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readPersonList() {
        try {
            Person[] personArray = mapper.readValue(new File("peopleList.json"), Person[].class);
            List<Person> personReadList  = Arrays.asList(personArray);
            System.out.println(personReadList.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readStudentList() {
        Student[] studentArray = new Student[0];
        try {
            studentArray = mapper.readValue(new File("studentList.json"), Student[].class);
            List<Student> studentReadList = Arrays.asList(studentArray);
            System.out.println(studentReadList.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        readPerson();
        readPersonList();
        readStudentList();

    }

}
