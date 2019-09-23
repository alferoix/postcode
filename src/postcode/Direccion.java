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
public class Direccion {
    
    private String code;
    
    public void setCode(String code) throws BadPostCodeException
    {
        if(code.length()<5)
        {
            throw new BadPostCodeException("El código debe tener al menos 5 dígitos");
        }
        else
        {
            this.code=code;
        }
    }
    
    
}
