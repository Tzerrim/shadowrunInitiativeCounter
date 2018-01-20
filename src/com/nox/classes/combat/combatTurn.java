package com.nox.classes.combat;

import com.nox.classes.personagesComparator;
import com.nox.interfaces.action;
import com.nox.interfaces.combat;
import com.nox.interfaces.personage;
import com.nox.interfaces.combatResponse;

import java.util.ArrayList;
import java.util.Collections;

public class combatTurn extends combat {

    private ArrayList<combatPass> combatPasses;
    private combatPass currentCombatPass;
    private ArrayList<personage> personages;

    public combatTurn( ArrayList<personage> personages, int combatTurnNumber){

        this.personages = personages;
    }

    public combatResponse doCombat(action action){

    }

    protected boolean checkPersonage () {
//        Collections.sort(personages, new personagesComparator());
//        personage pers = personages.get(0);
//        if( pers.getInitiativeRun() == combatPassNumber) {
//            return true;
//        }
//        else{
//            return false;
//        }
    }

    public ArrayList<combatPass> getCombatPasses() {
        return combatPasses;
    }

    public void setCombatPasses(ArrayList<combatPass> combatPasses) {
        this.combatPasses = combatPasses;
    }
}
