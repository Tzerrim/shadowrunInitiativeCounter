package com.nox.classes.factories;

import com.nox.classes.actions.delayedAction;
import com.nox.classes.actions.freeAction;
import com.nox.classes.actions.newInitiativeRollAction;
import com.nox.classes.actions.standartAction;
import com.nox.interfaces.action;
import com.nox.interfaces.factories.actionFactory;

import static com.nox.constants.interruptActions.FULL_DEFENCE_ACTION;
import static com.nox.constants.interruptActions.interruptMap;
import static com.nox.constants.strings.*;

public class simpleActionFactory extends actionFactory {

    @Override
    protected action createAction(String type, int cost, String subtype) {
        action action;

        if(STANDART_ACTION.equals(type)){
            action = new standartAction();
        }
        else if(DELAYED_ACTION.equals(type)){
            action = new delayedAction(cost);
        }
        else if (INTERRUPT_ACTION.equals(type)) {
           action = interruptMap.get(subtype).clone();
        }
        else if (ROLL_INITIATIVE_ACTION.equals(type)){
            action = new newInitiativeRollAction();
        }
        else {
            action = new freeAction();
        }
        return action;

    }
}
