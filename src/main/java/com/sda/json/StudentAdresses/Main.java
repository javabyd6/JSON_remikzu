package com.sda.json.StudentAdresses;

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

        Address address1 = new Address("Bydgoszcz", "Dluga 9");
        Address address2 = new Address("Warszawa", "Luzycka 1");
        Address address3 = new Address("Lodz", "Biedna 2");

        Student student1 = new Student("Jan", "Kowalski", address1);
        Student student2 = new Student("Tomasz", "Nowak", address2);
        Student student3 = new Student("Anna", "Jakas", address3);

        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);

        ObjectMapper mapper = new ObjectMapper();
        try {
            String studentsStr = mapper.writeValueAsString(listOfStudents);
            System.out.println(studentsStr);
            Files.write(Paths.get("studentList.json"), studentsStr.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
