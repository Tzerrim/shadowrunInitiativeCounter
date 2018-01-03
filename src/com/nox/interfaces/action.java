package com.nox.interfaces;

public abstract class action implements Cloneable {
    int cost;
    String name;

    @Override
    public action clone() {
        try {
            return (action)super.clone();
        }
        catch( CloneNotSupportedException ex ) {
            throw new InternalError();
        }
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
