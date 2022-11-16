/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author oliver
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double costo_Kilowatio;
        double kilowatio_Consumidos;
        double costo_Planilla;
        int edad;
        double descuento;
        
        System.out.println("Ingrese el costo de Kilowatio/hora");
        costo_Kilowatio = entrada.nextDouble();
        
        System.out.println("Ingrese los Kilowatios consumidos en el mes");
        kilowatio_Consumidos = entrada.nextDouble();
        
        System.out.println("Ingrese la edad del Usuario");
        edad = entrada.nextInt();
        
        costo_Planilla = costo_Kilowatio * kilowatio_Consumidos;
        
        if (edad > 65){
            descuento = costo_Planilla * 0.10;
            costo_Planilla = costo_Planilla - descuento;
        }
        
        System.out.printf("El valor a cancelar es: \n" + costo_Planilla);
                
    }
    
}
