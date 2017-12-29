package com.nox.interfaces;

import java.util.List;

public abstract class personage {
    int initiative;
    String name;
    int initiativeRun;
    int initiativeTurn;
    String owner;
    List <effect> effects;
    List <action> actions;

    public void addEffect(effect e){
        effects.add( e );
    }

    public void addAction( action a){
        actions.add(a);
    }

    public List<effect> getEffects() {
        return effects;
    }

    public void setEffects(List<effect> effects) {
        this.effects = effects;
    }

    public List<action> getActions() {
        return actions;
    }

    public void setActions(List<action> actions) {
        this.actions = actions;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getInitiativeRun() {
        return initiativeRun;
    }

    public void setInitiativeRun(int initiativeRun) {
        this.initiativeRun = initiativeRun;
    }

    public int getInitiativeTurn() {
        return initiativeTurn;
    }

    public void setInitiativeTurn(int initiativeTurn) {
        this.initiativeTurn = initiativeTurn;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
