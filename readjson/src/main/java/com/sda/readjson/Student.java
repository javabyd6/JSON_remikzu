package com.sda.readjson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Remigiusz Zudzin
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    String name;
    String lastName;
    Address address;
}
