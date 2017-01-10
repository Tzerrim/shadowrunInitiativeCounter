package com.nox.constants;

import com.nox.classes.interruptAction;

/**
 * Created by Nox on 10.01.2017.
 */
public class interruptActions {
    // Frome Core book
    public static interruptAction fullDefence =  new interruptAction(10,"Full defence");
    public static interruptAction block = new interruptAction( 5, "Block");
    public static interruptAction dodge = new interruptAction( 5 , "Dodge");
    public static interruptAction layDown = new interruptAction( 5, "Lay down");
    public static interruptAction intercept = new interruptAction(5, "Intercept");
    public static interruptAction parry = new interruptAction(5, "Parry");
    // From Run&Gun
    public static interruptAction countestrike = new interruptAction(7, "Counterstrike");
    public static interruptAction diveForCover = new interruptAction(5,"Dive for cover");
    public static interruptAction reversal = new interruptAction(7,"Reversal");
    public static interruptAction rightBackAtYa = new interruptAction(10, "Right back at ya!");
    public static interruptAction runForYourLife = new interruptAction(5, "Run for your life");
    public static interruptAction diveOnTheGrenade = new interruptAction(5, "Dive on the grenade");
    public static interruptAction sacrificeThrow = new interruptAction(10, "Sacrifice throw");
    public static interruptAction riposte = new interruptAction(7, "Riposte");
    public static interruptAction protectingThePrinciple = new interruptAction(5, "Protecting the principle");
    public static interruptAction shadowBlock = new interruptAction(5,"Shadow block");
}
