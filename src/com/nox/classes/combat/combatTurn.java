package com.nox.classes.combat;

import com.nox.classes.factories.simpleCombatPassFactory;
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
        this.count = combatTurnNumber;
        this.zerofyCombatPassForPersonages();
        currentCombatPass = new combatPass(personages,0);
        combatPasses = new ArrayList<combatPass>();
    }

    public combatResponse doCombat(action action){
        combatResponse response = currentCombatPass.doCombat(action);
        if(response.isMakeNew()) {
            combatPasses.add(currentCombatPass);
            currentCombatPass = (combatPass) simpleCombatPassFactory.getInstance().create(combatPasses.size() -1, personages);
            response = currentCombatPass.doCombat(action);
        }

        response.setMakeNew( !this.checkPersonage());
        return response;
    }

    protected boolean checkPersonage () {
        Collections.sort(personages, new personagesComparator());
        personage pers = personages.get(0);
        if( pers.getInitiativeTurn() ==  this.count) {
            return true;
        }
        else{
            return false;
        }
    }

    private void zerofyCombatPassForPersonages(){
        if(this.personages != null) {
            for(personage p : personages){
                p.setInitiativeRun(0);
            }
        }
    }

    public ArrayList<combatPass> getCombatPasses() {
        return combatPasses;
    }

    public void setCombatPasses(ArrayList<combatPass> combatPasses) {
        this.combatPasses = combatPasses;
    }
}
