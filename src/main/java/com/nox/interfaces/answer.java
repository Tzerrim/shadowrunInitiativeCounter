package com.nox.interfaces;

import java.util.ArrayList;

public abstract class answer {
    protected ArrayList<personage> personages;
    protected String answerText;

    public ArrayList<personage> getPersonages() {
        return personages;
    }

    public void setPersonages(ArrayList<personage> personages) {
        this.personages = personages;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }
}
