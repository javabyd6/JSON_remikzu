package com.sda.json;

import com.sda.json.Address;
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
