/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author oliver
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double descuento1;
        double descuento2;
        double descuento3;
        int dias;
        double precio_habitacion;
        double subtotal;
        double valor_descuento;
        double total;
        
        descuento1 = 10;
        descuento2 = 15;
        descuento3 = 20;
        valor_descuento = 0;
        
        System.out.println("Ingrese cuantos dias se va a hospedar");
        dias = entrada.nextInt();
        
        System.out.println("Ingrese el costo de la habitacion a hospedsr");
        precio_habitacion = entrada.nextDouble();
        
        subtotal = dias * precio_habitacion;
        
         if (dias > 5){
            valor_descuento = subtotal * descuento1 / 100;
         }
        else
        if (dias >10){
                valor_descuento = subtotal * descuento2 / 100;
                }
         if (dias >15){
                valor_descuento = subtotal * descuento3 / 100;
                }
         
         total = subtotal - valor_descuento;
    
    System.out.printf("El subtotal es: \n" + subtotal );
    System.out.printf("\nEl descuento es: \n" + valor_descuento);
    System.out.printf("\nEl total por pagar es: \n" + total);
       
    }
           
}
