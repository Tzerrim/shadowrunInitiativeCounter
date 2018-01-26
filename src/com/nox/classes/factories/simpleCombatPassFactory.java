package com.nox.classes.factories;

import com.nox.classes.combat.combatPass;
import com.nox.interfaces.combat;
import com.nox.interfaces.factories.combatFactory;
import com.nox.interfaces.personage;

import java.util.ArrayList;
import java.util.List;

public class simpleCombatPassFactory extends combatFactory {
    public combat create (int number, ArrayList<personage> personages){
        return new combatPass(personages, number);
    }
}
