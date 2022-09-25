package org.academiadecodigo.hackathon.exceptions;

import org.academiadecodigo.hackathon.errors.ErrorMessage;


/**
 * Thrown to indicate that the customer was not found
 */
public class UserNotFoundException extends Exception{

    /**
     * @see UserHackException#UserHackException(String)
     */
    public UserNotFoundException() {
        super(ErrorMessage.CUSTOMER_NOT_FOUND);
    }
}
