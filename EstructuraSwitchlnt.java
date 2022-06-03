/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraSwitchlnt {
    public static void main(String [] args) {
        try{ //Objeto leer de la BufferedReader
            BufferedReader leer = new BufferdReader (new InputStreamReader(System.in));
            System.out.println("Ingrese un número entre 1 y 5");
            int numero = Integer.parceInt(leer.radLine()); //Datos tipo int
            switchInt(numero);
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
    }
    
public static void switchInt(int numero){ //Método para el switch
    String nombreDelNumero;
    switch (numero){ //Valor o caracter a evaluar
        case 1: //En el caso que el caracter a evaluar
            nombreDelNumero = "Uno";
            break; //Detiene el proceso si era el valor integrado
        case 2: //En el caso que el valor sea 2 y asi sucesivamente
            nombreDelNumero = "Dos";
            break;
        case 3:
            nombreDelNumero = "Tres";
            break;
        case 4:
            nombreDelNumero = "Cuatro";
        case 5:
            nombreDelNumero = "Cinco";
            break;
        default: //Si no se cumple ninguno de loas anteriores
            nombreDelNumero = "Número no válido!";
    }
    System.out.println("El número ingresado es: " + nombreDelNumero);
  }  
}
    
