package com.nox.classes;

/**
 * Created by Nox on 09.01.2017.
 */
public class interruptAction {
    private int initiativePrice;
    private String interruptName;

    public interruptAction(){}

    public  interruptAction(int price, String name){
        this.initiativePrice = price;
        this.interruptName = name;
    }

    public int getInitiativePrice() {
        return initiativePrice;
    }

    public void setInitiativePrice(int initiativePrice) {
        this.initiativePrice = initiativePrice;
    }

    public String getInterruptName() {
        return interruptName;
    }

    public void setInterruptName(String interruptName) {
        this.interruptName = interruptName;
    }
}
