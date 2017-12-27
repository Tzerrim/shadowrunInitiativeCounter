package com.nox.classes.personages;

import com.nox.interfaces.personage;
/**
 * Created by Nox on 09.01.2017.
 */
public class playerPerson extends personage{
    private int reaction;
    private int intuition;
    private int initiativeDice;
    private int initiativeCount;
    private String player;


    public int getReaction() {
        return reaction;
    }

    public void setReaction(int reaction) {
        this.reaction = reaction;
    }

    public int getIntuition() {
        return intuition;
    }

    public void setIntuition(int intuition) {
        this.intuition = intuition;
    }

    public int getInitiativeDice() {
        return initiativeDice;
    }

    public void setInitiativeDice(int initiativeDice) {
        this.initiativeDice = initiativeDice;
    }

    public int getInitiativeCount() {
        return initiativeCount;
    }

    public void setInitiativeCount(int initiativeCount) {
        this.initiativeCount = initiativeCount;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }
}
