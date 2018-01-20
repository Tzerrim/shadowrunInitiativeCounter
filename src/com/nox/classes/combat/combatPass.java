package com.nox.classes.combat;

import com.nox.interfaces.action;
import com.nox.interfaces.combat;
import com.nox.interfaces.combatResponse;
import com.nox.interfaces.personage;
import com.nox.classes.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class combatPass extends combat {
    private ArrayList<String> actions;
    private int combatPassNumber;
    private action currentAction;



    public combatPass(ArrayList<personage> personages, int combatPassNumber){
        Collections.sort(personages, new personagesComparator());
        this.personages = personages;
        this.combatPassNumber = combatPassNumber;
    }

    public combatResponse doCombat(action action){
        personage pers = personages.get(0);
        if( this.checkPersonage()) {
            int initiative = pers.getInitiative();
            initiative = initiative - action.getCost();
            pers.setInitiative(initiative);
            pers.addAction( action);
            pers.setInitiativeRun(pers.getInitiativeRun() + (action.isPass() ?  +1 : + 0));
            combatResponse.setResultString(pers.getName() + " ->  "+ action.getName() );
            combatResponse.setMakeNew(! this.checkPersonage());
        }
        else {
            combatResponse.setResultString("Creating new turn");
            combatResponse.setMakeNew(! this.checkPersonage());
        }
        return combatResponse;
    }

    protected boolean checkPersonage () {
        Collections.sort(personages, new personagesComparator());
        personage pers = personages.get(0);
        if( pers.getInitiativeRun() == combatPassNumber) {
            return true;
        }
        else{
            return false;
        }
    }
    public ArrayList<String> getActions() {
        return actions;
    }

    public void setActions(ArrayList<String> actions) {
        this.actions = actions;
    }

    public int getCombatPassNumber() {
        return combatPassNumber;
    }

    public void setCombatPassNumber(int combatPassNumber) {
        this.combatPassNumber = combatPassNumber;
    }

    public action getCurrentAction() {
        return currentAction;
    }

    public void setCurrentAction(action currentAction) {
        this.currentAction = currentAction;
    }
}
