package com.nox.classes.actions;

import com.nox.interfaces.action;

import static com.nox.constants.strings.FREE_ACTION;

public class freeAction extends action {
    public freeAction () {
        this.setCost(0);
        this.setName(FREE_ACTION);
        this.pass = true;
    }
}
