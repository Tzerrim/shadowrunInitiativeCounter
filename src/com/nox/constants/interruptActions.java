package com.nox.constants;

import com.nox.classes.actions.interruptAction;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Nox on 10.01.2017.
 */
public class interruptActions {
    // ACTION NAMES
    public static final String FULL_DEFENCE = "Full defence";
    public static final String BLOCK = "Block";
    public static final String DODGE = "Dodge";
    public static final String LAY_DOWN = "Lay down";
    public static final String INTERCEPT = "Intercept";
    public static final String PARRY = "Parry";
    public static final String COUNTERSTRIKE = "Counterstrike";
    public static final String DIVE_FOR_COVER= "Dive for cover";
    public static final String REVERSAL = "Reversal";
    public static final String RIGHT_BACK_AT_YA = "Right back at ya!";
    public static final String RUN_FOR_YOUR_LIFE = "Run for your life";
    public static final String DIVE_ON_THE_GRENADE = "Dive on the grenade";
    public static final String SACRIFICE_THROW = "Sacrifice throw";
    public static final String RIPOSTE = "Riposte";
    public static final String PROTECTING_THE_PRINCIPLE = "Protecting the principle";
    public static final String SHADOW_BLOCK = "Shadow block";
    // ACTIONS
    // From Core book
    public static final interruptAction FULL_DEFENCE_ACTION =  new interruptAction(10,FULL_DEFENCE);
    public static final interruptAction BLOCK_ACTION = new interruptAction( 5, BLOCK);
    public static final interruptAction DODGE_ACTION = new interruptAction( 5 , DODGE);
    public static final interruptAction LAY_DOWN_ACTION = new interruptAction( 5, LAY_DOWN);
    public static final interruptAction INTERCEPT_ACTION = new interruptAction(5, INTERCEPT);
    public static final interruptAction PARRY_ACTION = new interruptAction(5, PARRY);
    // From Run&Gun
    public static final interruptAction COUNTERSTRIKE_ACTION = new interruptAction(7, COUNTERSTRIKE);
    public static final interruptAction DIVE_FOR_COVER_ACTION = new interruptAction(5,DIVE_FOR_COVER);
    public static final interruptAction REVERSAL_ACTION = new interruptAction(7,REVERSAL);
    public static final interruptAction RIGHT_BACK_AT_YA_ACTION = new interruptAction(10, RIGHT_BACK_AT_YA);
    public static final interruptAction RUN_FOR_YOUR_LIFE_ACTION = new interruptAction(5, RUN_FOR_YOUR_LIFE);
    public static final interruptAction DIVE_ON_THE_GRENADE_ACTION = new interruptAction(5, DIVE_ON_THE_GRENADE);
    public static final interruptAction SACRIFICE_THROW_ACTION = new interruptAction(10, SACRIFICE_THROW);
    public static final interruptAction RIPOSTE_ACTION = new interruptAction(7, RIPOSTE);
    public static final interruptAction PROTECTING_THE_PRINCIPLE_ACTION = new interruptAction(5, PROTECTING_THE_PRINCIPLE);
    public static final interruptAction SHADOW_BLOCK_ACTION = new interruptAction(5,SHADOW_BLOCK);
    // ACTION LIST
    public static final ArrayList<interruptAction> interruptList = new ArrayList<>(
            Arrays.asList(
                    FULL_DEFENCE_ACTION,
                    BLOCK_ACTION,
                    DODGE_ACTION,
                    LAY_DOWN_ACTION,
                    INTERCEPT_ACTION,
                    PARRY_ACTION,
                    COUNTERSTRIKE_ACTION,
                    DIVE_FOR_COVER_ACTION,
                    REVERSAL_ACTION,
                    RIGHT_BACK_AT_YA_ACTION,
                    RUN_FOR_YOUR_LIFE_ACTION,
                    DIVE_ON_THE_GRENADE_ACTION,
                    SACRIFICE_THROW_ACTION,
                    RIPOSTE_ACTION,
                    PROTECTING_THE_PRINCIPLE_ACTION,
                    SHADOW_BLOCK_ACTION
            ));

}
