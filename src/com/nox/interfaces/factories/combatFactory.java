package com.nox.interfaces.factories;

import com.nox.interfaces.combat;
import com.nox.interfaces.personage;

import java.util.List;

public abstract class combatFactory {

    public abstract combat create(int number, List<personage> personages);
}
