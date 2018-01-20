package com.nox.classes;

import com.nox.interfaces.personage;

import java.util.Comparator;

public class personagesComparator implements Comparator<personage> {
    @Override
    public int compare(personage personage1, personage personage2){
        int inititativePassCompatarion =  personage1.getInitiativeRun() - personage2.getInitiativeRun();
        return inititativePassCompatarion == 0 ?  (personage1.getInitiative() - personage2.getInitiative()) : inititativePassCompatarion;
    }
}
