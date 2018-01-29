package com.nox.classes.actions;

import com.nox.interfaces.action;

import static com.nox.constants.strings.ROLL_INITIATIVE_ACTION;

public class newInitiativeRollAction extends action {
    public newInitiativeRollAction (){
        this.setCost(0);
        this.setName(ROLL_INITIATIVE_ACTION);
        this.pass = false;
    }
}
