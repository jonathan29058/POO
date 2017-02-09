
package progravisual;

import java.util.Scanner;

public class GasPrices {
    private static double pricePerBarrel;
    private double a;
    private double b;
    private static double x;
    private double y;
    public static double Rango(double x){
        return x*.04;
        }
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        GasPrices p1=new GasPrices();
        p1.pricePerBarrel=teclado.nextDouble();
        x=Rango(pricePerBarrel);
        System.out.println("el precio por barril es de"+" "+x); 
    }  
}
    


