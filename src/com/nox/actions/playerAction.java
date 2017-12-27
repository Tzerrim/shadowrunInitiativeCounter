package com.nox.actions;

import com.nox.classes.interruptAction;
import com.nox.classes.personages.playerPerson;

/**
 * Created by Nox on 11.01.2017.
 */
public class playerAction {

    public static playerPerson action(playerPerson playerPerson){
        playerPerson.setInitiativeCount(playerPerson.getInitiativeCount() - 10 );
        playerPerson.setInitiativeTurn(playerPerson.getInitiativeTurn()+1 );
        return playerPerson;
    }

    public static playerPerson interrupt (playerPerson playerPerson, interruptAction action){
        if(playerPerson.getInitiativeCount() - action.getInitiativePrice() > 0) {
            playerPerson.setInitiativeCount(playerPerson.getInitiativeCount() - action.getInitiativePrice());
        }
        return playerPerson;
    }

}
