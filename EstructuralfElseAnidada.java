/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuralfElseAnidada {
    public static void main(String[] args) {
        try{ //Objeto leer de la clase BufferedReader
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar la cantidad de su salario:");
            double salario = Double.parseDouble(leer.readLine());
            ifElseAnidada(salario); //Enviar el valor de salario a aser evaluado al método
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
public static void ifElseAnidada (double salario){
    if(salario > 235){ //La condicion que se evalua y en caso de ser verdadera 
        System.out.println("Usted gana mas del salario mínimo");
    }else if(salario >0){ //Si la condición anterior no se cumple evalua la siguiente
        System.out.println("Usted gana menos del salario mínimo");
    }else{//En caso que la condición anterior no se cumple se ejecuta lo siguiente
        System.out.println("Ingreso de dato erroneo!");
        
    }    
    }
}
