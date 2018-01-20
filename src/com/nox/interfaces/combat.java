package com.nox.interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class combat {
    protected int count;
    protected ArrayList<personage> personages;
    protected combatResponse combatResponse;

    protected abstract combatResponse doCombat(action action);

    protected abstract boolean checkPersonage();

}
