package com.nox.interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class combat {
    protected int count;
    protected ArrayList<personage> personages;
    protected combatResponse combatResponse;

    protected abstract combatResponse doCombat(action action);

    protected abstract boolean checkPersonage();

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ArrayList<personage> getPersonages() {
        return personages;
    }

    public void setPersonages(ArrayList<personage> personages) {
        this.personages = personages;
    }

    public com.nox.interfaces.combatResponse getCombatResponse() {
        return combatResponse;
    }

    public void setCombatResponse(com.nox.interfaces.combatResponse combatResponse) {
        this.combatResponse = combatResponse;
    }
}
