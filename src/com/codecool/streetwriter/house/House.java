package com.codecool.streetwriter.house;

import java.util.Set;
import java.util.HashSet;


public class House {

//--------------------------------------------------------------------------------------------------
    // Constructors


    public House(int address) {
        this.address = address;
    }


//-------------------------------------------------------------------------------------------------
    // Methods


    public void moveIn(Person resident) {
        residents.add(resident);
    }


    public void purchaseBy(Person customer) {
        this.owner = customer;
    }



//-----------------------------------------------------------------------------------------------------
    // FIELDS


    private int address;
    private Person owner;

    private Set<Person> residents = new HashSet<>();


}
