/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.ciclicas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class LecturaCaracteres {
    public static void main (String[] args){
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar el nombre:");
            String nombre = leer.readLine ();
            //Pasar todo a mayúscula
            leerCaracteresFor(nombre.toUpperCase());
            }catch(Exception e){
                System.out.println("Ingresar el nombre");
            }
        }
            public static void leerCaracteresFor(String palabra){
                //for(valor incial; valor final; incremento)
                for(int i = 0; i < palabra.length(); i++){//Parametro final la cantidad de caracteres
                    //palabra.charAt (i) imprimi el caracteres correspondiente a la posición 1
                    System.out.println("Caracter: " + i + " ->: " + palabra.charAt(i));
                    
        }
        
    }
}
