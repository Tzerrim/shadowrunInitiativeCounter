package com.nox.interfaces;

import java.util.List;


public abstract class personage implements Comparable <personage>{
    protected int initiative;       // Current inititative count: REA + INT + rolled d6 + other mods
    protected int initiativeRun;    // Their initaitve run. 1 run - many turns
    protected int initiativeTurn;   // Yjeit initative turn. Over 10 initiative, it is initiative pass
    protected int status;           //  >0 - Ok, =0 - down, bleeding and so on, <0 - dead, escaped and so on out of the combat
    protected String owner;         // Name of the gamer, who controll this personage
    protected String name;          // Name of the personage
    protected List <effect> effects;// List of current effects, which modifies initiative
    protected List <action> actions;// List of actions in this combat


    public int compareTo(personage comparePersonage) {

        int compareInititative = ((personage) comparePersonage).getInitiative();

        //ascending order
        return this.initiative - compareInititative;

        //descending order
        //return compareQuantity - this.quantity;

    }

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
