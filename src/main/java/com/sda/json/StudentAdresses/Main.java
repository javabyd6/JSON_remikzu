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

        Student student1 = new Student("Jan", "Kowalski", new Address("Bydgoszcz", "Dluga 9"));
        Student student2 = new Student("Tomasz", "Nowak", new Address("Warszawa", "Luzycka 1"));
        Student student3 = new Student("Anna", "Jakas", new Address("Lodz", "Biedna 2"));

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
