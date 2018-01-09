package com.nox.classes.combat;

import com.nox.interfaces.action;
import com.nox.interfaces.combat;
import com.nox.interfaces.personage;
import com.nox.classes.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class combatPass extends combat {
    private ArrayList<String> actions;

    private ArrayList<personage> activePersonages;
    private ArrayList<personage> passivePersonages;

    private action currentAction;

    public combatPass(ArrayList<personage> personages){
        Collections.sort(personages, new personagesComparator());
        this.personages = personages;
        activePersonages = personages;
        passivePersonages = new ArrayList<personage>();
    }

    public String doCombat(action newAction){
        while (activePersonages.size() > 0) {
            personage pers = activePersonages.get(0);
            pers = this.doAction(pers, newAction);
            passivePersonages.add(pers);
            activePersonages.remove()
        }

    }

    private personage doAction( personage pers, action action){
       int initiative = pers.getInitiative();
       initiative = initiative - action.getCost();
       pers.setInitiative(initiative);
       pers.addAction( action);
       return pers;
    }


    public ArrayList<String> getActions() {
        return actions;
    }

    public void setActions(ArrayList<String> actions) {
        this.actions = actions;
    }
}
