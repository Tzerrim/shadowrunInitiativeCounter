package com.nox.constants;

import com.nox.classes.interruptAction;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Nox on 10.01.2017.
 */
public class interruptActions {
    // From Core book
    public static final interruptAction fullDefence =  new interruptAction(10,"Full defence");
    public static final interruptAction block = new interruptAction( 5, "Block");
    public static final interruptAction dodge = new interruptAction( 5 , "Dodge");
    public static final interruptAction layDown = new interruptAction( 5, "Lay down");
    public static final interruptAction intercept = new interruptAction(5, "Intercept");
    public static final interruptAction parry = new interruptAction(5, "Parry");
    // From Run&Gun
    public static final interruptAction countestrike = new interruptAction(7, "Counterstrike");
    public static final interruptAction diveForCover = new interruptAction(5,"Dive for cover");
    public static final interruptAction reversal = new interruptAction(7,"Reversal");
    public static final interruptAction rightBackAtYa = new interruptAction(10, "Right back at ya!");
    public static final interruptAction runForYourLife = new interruptAction(5, "Run for your life");
    public static final interruptAction diveOnTheGrenade = new interruptAction(5, "Dive on the grenade");
    public static final interruptAction sacrificeThrow = new interruptAction(10, "Sacrifice throw");
    public static final interruptAction riposte = new interruptAction(7, "Riposte");
    public static final interruptAction protectingThePrinciple = new interruptAction(5, "Protecting the principle");
    public static final interruptAction shadowBlock = new interruptAction(5,"Shadow block");

    public static final ArrayList<interruptAction> interruptList = new ArrayList<>(
            Arrays.asList(
                    fullDefence,
                    block,
                    dodge,
                    layDown,
                    intercept,
                    parry,
                    countestrike,
                    diveForCover,
                    reversal,
                    rightBackAtYa,
                    runForYourLife,
                    diveOnTheGrenade,
                    sacrificeThrow,
                    riposte,
                    protectingThePrinciple,
                    shadowBlock
            ));

}
