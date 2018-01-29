package com.nox.classes.combat;

import com.nox.classes.factories.simpleCombatTurnFactory;
import com.nox.interfaces.action;
import com.nox.interfaces.combat;
import com.nox.interfaces.combatResponse;
import com.nox.interfaces.personage;

import java.util.ArrayList;
import java.util.List;

public class mainCombat extends combat {
    private combatTurn currentCombatTurn;
    private ArrayList<combatTurn> combatTurns;

    public mainCombat(ArrayList<personage> personages){
        this.personages = personages;
        this.count = 0;
        this.currentCombatTurn = (combatTurn) simpleCombatTurnFactory.getInstance().create(0, personages);
        combatTurns = new ArrayList<combatTurn>();
    }

    public combatResponse doCombat(action action){
        personage pers = personages.get(0);
        combatResponse =  currentCombatTurn.doCombat(action);
        if(combatResponse.isMakeNew()) {
            combatTurns.add(currentCombatTurn);
            currentCombatTurn = (combatTurn) simpleCombatTurnFactory.getInstance().create(combatTurns.size() -1, personages);
            combatResponse =  currentCombatTurn.doCombat(action);
        }

        return combatResponse;
    }

    protected boolean checkPersonage () {
        return true;
    }

}
