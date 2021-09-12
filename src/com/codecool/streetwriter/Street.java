package com.codecool.streetwriter;

import com.codecool.streetwriter.house.House;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Street {

//---------------------------------------------------------------------------------------------------
    // Constructors

    public Street(String name) {
        this.name = name;
    }



    public Street(String name, House... house) {
        this.name = name;
        this.houses.addAll(Arrays.asList(house));
    }


 //---------------------------------------------------------------------------------------------------
    // Methods

    public void build(House house) {
        this.houses.add(house);
    }

    public boolean rename(String newName) {
        if(isStringOnlyLetters(newName)) {
            name = newName;
            return true;
        }
        return false;
    }


    private boolean isStringOnlyLetters(String str) {
        char[] chars = name.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }


 //----------------------------------------------------------------------------------------------------
    // FIELDS


    private String name;
    private Set<House> houses = new HashSet<>();


}

