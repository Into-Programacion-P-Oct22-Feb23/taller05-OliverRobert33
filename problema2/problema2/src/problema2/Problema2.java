/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author oliver
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
    String articulos;
    int cantidad_Unidades;
    double precio_Unitario = 10;
    double descuento = 15; 
    double valor_Pagar; 
    
    System.out.println("Ingrese el articulo que desea");
    articulos = entrada.nextLine();
    
    System.out.println("Ingrese cuantas unidades desea");
    cantidad_Unidades = entrada.nextInt();
    
    valor_Pagar = cantidad_Unidades * precio_Unitario;
    
    if (cantidad_Unidades > 50 ){
        valor_Pagar = valor_Pagar * descuento / 100;
    }
    
    System.out.printf("El costos del articulo/s es:" + valor_Pagar);
       
    }
    
}
