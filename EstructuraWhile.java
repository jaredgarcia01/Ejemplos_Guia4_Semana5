/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.ciclicas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraWhile {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar un numero limite de repetición: ");
            String limite = leer.readLine();
            if(limite ==null){//Evalua si el valor string no este vacio
            }else{
                //Envio de parametro al metodo correspondiente haciendo la conversion o casting de datos
                instruccionWhileSencillo(Integer.parseInt(limite));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        } 
        }
           
        public static void instruccionWhileSencillo(int valorLimite){
            int i = 1;//Valor inicial del contador
            while(i <=valorLimite){//Repetir mientras no se cumpla la condicion
                System.out.println("El valor de la repetion es: " +i);
                i++; //Incremento de 1 por cada interacion
        }         
    } 
}
