package com.sda.savejson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Remigiusz Zudzin
 */
@Data //<- gettery i setery
@AllArgsConstructor //konstruktory warunkowe
@NoArgsConstructor //konstruktory bezwarunkowe
public class Person {

    private String name;
    private String lastname;
    private int age;


}
