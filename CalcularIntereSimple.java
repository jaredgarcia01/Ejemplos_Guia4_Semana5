/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.ciclicas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalcularIntereSimple {
    public static void main(String[] args){
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
            System.out.println("Ingresar la siguiente Informacion:");
            System.out.println("Cantidad de dinero depositada:");
            double cantidad = Double.parseDouble(leer.readLine());
            System.out.println("Cantidad de dinero del deposito");
            int anhios = Integer.parseInt(leer.readLine());
            System.out.println("Interes anual porel deposito");
            double interes = Double.parseDouble(leer.readLine());
            System.out.println("---------------------------");
            interesSimple(cantidad, anhios, interes);
            }catch(Exception e){
                    System.out.println(e.getMessage());      
            }
         }
        public static void interesSimple(double cantidad,int anhios, double interes){
           for(int i = 1; i<= anhios; i++){
               double interesPorAnhio = cantidad * (interes / 100); //Calcular del interes anual
               cantidad +=cantidad * (interes / 100); //Suma la cantidad acual + el interes de esa cantidad
               System.out.println("Cantidad interes en el año " + i + ": " + interesPorAnhio);
               System.out.println("Monto interes mas dinero: " + cantidad);
               System.out.println("------------------------------");
        }
    }
}
