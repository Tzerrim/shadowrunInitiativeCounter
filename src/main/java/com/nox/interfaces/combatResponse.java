package com.nox.interfaces;

public abstract class combatResponse {
    protected String resultString;
    protected boolean makeNew;

    public String getResultString() {
        return resultString;
    }

    public void setResultString(String resultString) {
        this.resultString = resultString;
    }

    public boolean isMakeNew() {
        return makeNew;
    }

    public void setMakeNew(boolean makeNew) {
        this.makeNew = makeNew;
    }
}
