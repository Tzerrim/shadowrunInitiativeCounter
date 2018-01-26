package com.nox.classes.factories;

import com.nox.classes.combat.combatTurn;
import com.nox.interfaces.combat;
import com.nox.interfaces.factories.combatFactory;
import com.nox.interfaces.personage;

import java.util.ArrayList;

public class simpleCombatTurnFactory extends combatFactory {
    public combat create(int number, ArrayList<personage> personages){
        return new combatTurn(personages, number);
    }
}
