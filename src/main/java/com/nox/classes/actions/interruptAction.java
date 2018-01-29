package com.nox.classes.actions;

import com.nox.interfaces.action;

/**
 * Created by Nox on 09.01.2017.
 */
public class interruptAction extends action {
    public interruptAction (int initiativeCost, String name){
        this.setCost(initiativeCost);
        this.setName(name);
        this.pass = false;
    }
}
