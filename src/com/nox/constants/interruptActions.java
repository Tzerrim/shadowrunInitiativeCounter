package com.nox.constants;

import com.nox.classes.interruptAction;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Nox on 10.01.2017.
 */
public class interruptActions {
    // From Core book
    public static final interruptAction FULL_DEFENCE =  new interruptAction(10,"Full defence");
    public static final interruptAction BLOCK = new interruptAction( 5, "Block");
    public static final interruptAction DODGE = new interruptAction( 5 , "Dodge");
    public static final interruptAction LAY_DOWN = new interruptAction( 5, "Lay down");
    public static final interruptAction INTERCEPT = new interruptAction(5, "Intercept");
    public static final interruptAction PARRY = new interruptAction(5, "Parry");
    // From Run&Gun
    public static final interruptAction COUNTERSTRIKE = new interruptAction(7, "Counterstrike");
    public static final interruptAction DIVE_FOR_COVER = new interruptAction(5,"Dive for cover");
    public static final interruptAction REVERSAL = new interruptAction(7,"Reversal");
    public static final interruptAction REGHIT_BACK_AT_YA = new interruptAction(10, "Right back at ya!");
    public static final interruptAction RUN_FOR_YOUR_LIFE = new interruptAction(5, "Run for your life");
    public static final interruptAction DIVE_ON_THE_GRENADE = new interruptAction(5, "Dive on the grenade");
    public static final interruptAction SACRIFICE_THROW = new interruptAction(10, "Sacrifice throw");
    public static final interruptAction RIPOSTE = new interruptAction(7, "Riposte");
    public static final interruptAction PROTECTING_THE_PRINCIPLE = new interruptAction(5, "Protecting the principle");
    public static final interruptAction SHADOW_BLOCK = new interruptAction(5,"Shadow block");

    public static final ArrayList<interruptAction> interruptList = new ArrayList<>(
            Arrays.asList(
                    FULL_DEFENCE,
                    BLOCK,
                    DODGE,
                    LAY_DOWN,
                    INTERCEPT,
                    PARRY,
                    COUNTERSTRIKE,
                    DIVE_FOR_COVER,
                    REVERSAL,
                    REGHIT_BACK_AT_YA,
                    RUN_FOR_YOUR_LIFE,
                    DIVE_ON_THE_GRENADE,
                    SACRIFICE_THROW,
                    RIPOSTE,
                    PROTECTING_THE_PRINCIPLE,
                    SHADOW_BLOCK
            ));

}
