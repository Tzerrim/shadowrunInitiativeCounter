package com.nox.interfaces.factories;

import com.nox.interfaces.action;

public abstract class actionFactory {

    public action doActrion(String type, int cost, String subtype){
        action action;
        action = createAction(type, cost, subtype);
        return action;
    }

    protected abstract action createAction(String type, int cost, String subtype);
}
