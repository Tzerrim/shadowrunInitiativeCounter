package com.nox.interfaces;

public abstract class effect {
    public int beginds;
    public int duration;
    public String name;
    public String desctiption;

    public int getBeginds() {
        return beginds;
    }

    public void setBeginds(int beginds) {
        this.beginds = beginds;
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
}
