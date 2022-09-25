package org.academiadecodigo.hackathon.exceptions;

/**
 * A generic java bank exception to be used as base for concrete types of exceptions
 *
 * @see Exception
 */
public class UserHackException extends Exception {

    /**
     * @see Exception#Exception(String)
     */
    public UserHackException(String message) {
        super(message);
    }
}
