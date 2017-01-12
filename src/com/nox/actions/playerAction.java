package com.nox.actions;

import com.nox.classes.interruptAction;
import com.nox.classes.person;

/**
 * Created by Nox on 11.01.2017.
 */
public class playerAction {

    public static person action( person person){
        person.setInitiativeCount(person.getInitiativeCount() - 10 );
        person.setInitiativeTurn(person.getInitiativeTurn()+1 );
        return person;
    }

    public static person interrupt (person person, interruptAction action){
        if(person.getInitiativeCount() - action.getInitiativePrice() > 0) {
            person.setInitiativeCount(person.getInitiativeCount() - action.getInitiativePrice());
        }
        return person;
    }

}
