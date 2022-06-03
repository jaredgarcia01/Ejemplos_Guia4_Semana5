/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author roman
 */
public class EstructuralfElse {
  public static void main (String [] args ){
      try{ //Objeto leer de la clase BufferedReader
          BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
           System.out.println("Ingresar la cantidad de su salario :");
           double salario = Double.parseDouble(leer.readLine());
           ifElse(salario); //Envia el valor de salario a aser evaluado
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
}
  
public static void ifElse(double salario) {
    if(salario > 235){ //La condición que se evalua y en caso de ser verdadera
        System.out.println("Usted gana mas del salario mínimo");
    }else{ //En caso que la condición anterior no se cumpla se ejecuta lo siguiente
        System.out.println("Usted gana menos del salario minimo");
        
    }
  }  
}
