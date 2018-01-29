package com.nox.interfaces;

public abstract class effect {
    protected int begins;
    protected int duration;
    protected int lost;
    protected boolean active;
    protected String name;
    protected String desctiption;


    public int getBegins() {
        return begins;
    }

    public void setBegins(int begins) {
        this.begins = begins;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesctiption() {
        return desctiption;
    }

    public void setDesctiption(String desctiption) {
        this.desctiption = desctiption;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
