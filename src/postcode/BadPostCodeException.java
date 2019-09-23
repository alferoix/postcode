/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postcode;

/**
 *
 * @author Casa
 */
public class BadPostCodeException extends Exception{
    public BadPostCodeException()
    {
            super();
    }
    public BadPostCodeException(String message)
    {
            super(message);
    }
}
