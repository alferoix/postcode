/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Casa
 */
public class PostCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        Direccion p = new Direccion();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Por favor ingrese el código");
        String code = br.readLine();
        try{
            p.setCode(code);
        }catch(BadPostCodeException e)
        {
            System.out.println(e.toString());
        }
    }
    
}
