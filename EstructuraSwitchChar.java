/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraSwitchChar {

    private static int estadoCivil;
    public static void main(String [] args) {
        try{ //Objeto leer de la clase BufferedReader
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar el estado civil de la persona:");
            String estadoCivil = leer.readLine(); //Datos tipo String
            //toUppercase combierte el contenido a mayúscula y cahrAt extrae el caracter de la posición 0
            switchChar(estadoCivil.toUppercase().charAt(0));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
      public static void switchChar(char estadocivil){ //Método para el switch
          String mensajeEstadoCivil;
          switch(estadoCivil){ //Valor o caracter a evaluar
              case 'S': //En el caso que el valor sea"S"
                  mensajeEstadoCivil = "Soltero/a";
                  break; //Detiene el proceso si era el valor ingresado
              case 'D': //En el caso que el valor sea "C" y asi sucesivamente
                  mensajeEstadoCivil = "Casado/a";
                  break;
              case 'A':
                   mensajeEstadoCivil = "Divorsiado/a";
                   break; 
              case 'F':
                   mensajeEstadoCivil = "Acompañado/a";
                   break;
                   mensajeEstadoCivil = "Forever Alone";
                    break;
              default: //Si no se cumple niinguno de los anteriores
                  mensajeEstadoCivil = "EstadoCivil erroneo!";
        }
          System.out.println("Su estadoCivil es: " + mensajeEstadoCivil);
          
      }
          
 }
    

