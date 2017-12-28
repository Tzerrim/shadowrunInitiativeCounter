package com.nox.classes.actions;

import com.nox.interfaces.action;

import static com.nox.constants.strings.STANDART_ACTION;

public class standartAction extends action {
    public standartAction(){
        this.setCost(10);
        this.setName(STANDART_ACTION);
    }
}
