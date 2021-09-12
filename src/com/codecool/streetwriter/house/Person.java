package com.codecool.streetwriter.house;

import java.util.HashSet;
import java.util.Set;


public class Person {

//------------------------------------------------------------------------------------------------------
    // Constructors

    public Person(String name) {
        this.name = name;
    }


//-----------------------------------------------------------------------------------------------------
    // Methods


    public void buy(House house) {
        // When the person buys a house, becomes owner of the House object.
        properties.add(house);
        house.purchaseBy(this);
    }


//----------------------------------------------------------------------------------------------------------
    // FIELDS

    private String name;

    private Set<House> properties = new HashSet<>();

}
