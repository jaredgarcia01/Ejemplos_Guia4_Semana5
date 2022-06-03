/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.condicionales;
//Importación de clases para la lectura desde teclado
import java.io.BufferedReader;
import java.io.InputStreamReader;


        public class EstructuralfSencilla {
    public static void main (String[] args ) {
try{ //Objeto leer de la clase BufferedReader
    BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
    System.out.println("Ingresar la cantidad de su salario:");
    double salario = Double.parseDouble(leer.readLine());
    ifSencillo(salario) ; //Envia el valor de salario a aser evaluado al método
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
}
    public static void ifSencillo(double salario){
        if(salario > 235){ //La condicion que se evalua y en caso de ser verdadera
            System.out.println("Usted gana mas del salario mínimo");
        }

 }
    
