/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author oliver
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
      
        String marca_automovil;
        String origen_automovil;
        double costo_automovil;
        double impuesto_pagar;
        double precio_venta;
       
        impuesto_pagar = 0;
        precio_venta =0;
        
        System.out.println("Ingrese la marca de el automovil");
        marca_automovil = entrada.nextLine();
        System.out.println("Ingrese el origen de el automovil");
        origen_automovil = entrada.nextLine();
        System.out.println("Ingrese el costo de el automovil");
        costo_automovil = entrada.nextDouble();
        
            if (origen_automovil.equals("Alemania") ){
        impuesto_pagar = costo_automovil * 20 / 100;
    }
            if (origen_automovil.equals("Japon") ){
        impuesto_pagar = costo_automovil * 30 / 100;
    }
            if (origen_automovil.equals("Italia") ){
        impuesto_pagar = costo_automovil * 15 / 100;
    }
            if (origen_automovil.equals("USA") ){
        impuesto_pagar = costo_automovil * 8 / 100;
    }
        
            precio_venta = costo_automovil + impuesto_pagar;
            
        System.out.printf("La marca del automovil es:\n" + marca_automovil);
        System.out.printf("\nEl origen del automovil es:\n" + origen_automovil);
        System.out.printf("\nEl costo del automovil es:\n" + costo_automovil);
        System.out.printf("\nEl impuesto por pagar es:\n" + impuesto_pagar);
        System.out.printf("\nEl preco de venta es:\n" + precio_venta);
    }
    
}
