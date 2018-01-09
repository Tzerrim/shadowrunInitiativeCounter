package com.nox.classes.combat;

import com.nox.interfaces.combat;
import com.nox.interfaces.personage;

import java.util.ArrayList;

public class combatTurn extends combat {

    private ArrayList<combatPass> combatPasses;
    private combatPass currentCombatPass;
    private ArrayList<personage> personages;

    public combatTurn( ArrayList<personage> personages){
        this.personages = personages;
    }

    public void doCombat(){

    }

    public ArrayList<combatPass> getCombatPasses() {
        return combatPasses;
    }

    public void setCombatPasses(ArrayList<combatPass> combatPasses) {
        this.combatPasses = combatPasses;
    }
}
