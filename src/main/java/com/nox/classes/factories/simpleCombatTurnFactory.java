package com.nox.classes.factories;

import com.nox.classes.combat.combatTurn;
import com.nox.interfaces.combat;
import com.nox.interfaces.factories.combatFactory;
import com.nox.interfaces.personage;

import java.util.ArrayList;

// Singleton
public class simpleCombatTurnFactory extends combatFactory {

    private static simpleCombatTurnFactory uniqueInstance;

    public static synchronized simpleCombatTurnFactory getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new simpleCombatTurnFactory();
        }
        return uniqueInstance;
    }

    public combat create(int number, ArrayList<personage> personages){
        return new combatTurn(personages, number);
    }
}
