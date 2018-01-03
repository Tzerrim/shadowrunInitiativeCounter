package com.nox.classes.factories;

import com.nox.classes.actions.delayedAction;
import com.nox.classes.actions.standartAction;
import com.nox.interfaces.action;
import com.nox.interfaces.factories.actionFactory;

import static com.nox.constants.interruptActions.FULL_DEFENCE_ACTION;
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
           if(FULL_DEFENCE.equals(subtype) ) {
               return action = FULL_DEFENCE_ACTION.clone();
           }
        }


        return action;

    }
}
