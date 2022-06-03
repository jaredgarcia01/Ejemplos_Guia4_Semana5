/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.ciclicas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraFor {
    public static void main(String[] args) {
    try{
        BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Ingresar un numero limite de repetición: ");
        String limite = leer.readLine();
        //Casting o conversion de datos al momento de envio
        instruccionFor(Integer.parseInt(limite));
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
    
    public static void instruccionFor(int valorLimite){
        //for(valor incial; valor final; incremento
        for(int i =1; i <= valorLimite; i++){
        System.out.println("El valor de la repeticion es: " + i);
            
        }
    }
}
