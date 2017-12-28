package com.nox.interfaces;

public abstract class personage {
    int initiative;
    String name;
    int initiativeRun;
    int initiativeTurn;
    String owner;



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
