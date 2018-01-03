package com.nox.classes.actions;

import com.nox.interfaces.action;

import static com.nox.constants.strings.DELAYED_ACTION;

public class delayedAction extends action {
    public delayedAction(int cost){
        this.setCost(cost);
        this.setName(DELAYED_ACTION);
    }
}
