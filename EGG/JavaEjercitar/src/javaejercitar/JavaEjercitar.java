/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercitar;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class JavaEjercitar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frasec;
        String retorno;
        System.out.println(" Ingrese la frase que desee codificar");
        String fraseS = leer.nextLine();
        fraseS = fraseS.toLowerCase();

        retorno = codi(fraseS);
        System.out.println(retorno);
          
        
      
        
        
       
       
                
    }
    
    public static String codi (String fraseS){
        
        for(int i = 0; i <= fraseS.length(); i++){
        
        String letra = fraseS.substring(0, fraseS.length());
        String ccode = "";
        if ("a".equals(letra) || "e".equals(letra) || "i".equals(letra) || "o".equals(letra) || "u".equals(letra)){
            switch (letra){
        
                case "a":  
                    ccode = "@";
                    ccode.concat(letra);
                break;
                case "e":  
                     ccode = "#";
                     ccode.concat(letra);
                break;
                 case "i":  
                     ccode = "$";
                     ccode.concat(letra);
                break;
                 case "o":  
                     ccode = "%";
                     ccode.concat(letra);
                break;
                 case "u":  
                     ccode = "*";
                     ccode.concat(letra);
                break;
            }
      
        }
                  
      return ccode;
    
           
        }
        return null;

    }
}
