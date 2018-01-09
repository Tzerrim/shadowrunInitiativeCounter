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
    private boolean active;

    public combatPass(ArrayList<personage> personages){
        Collections.sort(personages, new personagesComparator());
        this.personages = personages;
        this.activePersonages = personages;
        this.passivePersonages = new ArrayList<personage>();
        this.active = true;
    }

    public String doCombat(action newAction){
        String result;
        String beginInitiative;
        if (activePersonages.size() > 0) {
            personage pers = activePersonages.get(0);
            beginInitiative = String.valueOf(pers.getInitiative());
            pers = this.doAction(pers, newAction);
            passivePersonages.add(pers);
            activePersonages.remove(pers);
            result = pers.getName() + " ( " + pers.getOwner() +  " ) [" + beginInitiative + " -> " + pers.getInitiative() + " ] " + newAction.getName();
        }
        else {
            result = "End of combat pass.";
        }
        return result;
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
