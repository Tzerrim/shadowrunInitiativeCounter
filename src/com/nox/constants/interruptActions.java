package com.nox.constants;

import com.nox.classes.actions.interruptAction;
import com.nox.interfaces.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nox on 10.01.2017.
 */


import static com.nox.constants.strings.*;

public class interruptActions {

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

    public static final Map<String, action> interruptMap = new HashMap<String, action>(){{
        put(FULL_DEFENCE_ACTION.getName(), FULL_DEFENCE_ACTION);
        put(BLOCK_ACTION.getName(), BLOCK_ACTION);
        put(DODGE_ACTION.getName(), DODGE_ACTION);
        put(LAY_DOWN_ACTION.getName(), LAY_DOWN_ACTION);
        put(INTERCEPT_ACTION.getName(), INTERCEPT_ACTION);
        put(PARRY_ACTION.getName(), PARRY_ACTION);
        put(COUNTERSTRIKE_ACTION.getName(), COUNTERSTRIKE_ACTION);
        put(DIVE_FOR_COVER_ACTION.getName(), DIVE_FOR_COVER_ACTION);
        put(REVERSAL_ACTION.getName(), REVERSAL_ACTION);
        put(RIGHT_BACK_AT_YA_ACTION.getName(), RIGHT_BACK_AT_YA_ACTION);
        put(RUN_FOR_YOUR_LIFE_ACTION.getName(), RUN_FOR_YOUR_LIFE_ACTION);
        put(DIVE_ON_THE_GRENADE_ACTION.getName(), DIVE_ON_THE_GRENADE_ACTION);
        put(SACRIFICE_THROW_ACTION.getName(), SACRIFICE_THROW_ACTION);
        put(RIPOSTE_ACTION.getName(), RIPOSTE_ACTION);
        put(PROTECTING_THE_PRINCIPLE_ACTION.getName(), PROTECTING_THE_PRINCIPLE_ACTION);
        put(SHADOW_BLOCK_ACTION.getName(), SHADOW_BLOCK_ACTION);

    }};


    // ACTION LIST
//    public static final ArrayList<interruptAction> interruptList =  (ArrayList<interruptAction>)interruptMap.values();



}
