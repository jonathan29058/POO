
package progravisual;

import java.util.Scanner;

public class GasPrices {
    private Double pricePerBarrel;
    private Double a;
    private Double b;
    private Double x;
    private Double y;
    public static Double Rango(double x){
        return x*.04;
        }
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        GasPrices p1=new GasPrices();
        p1.pricePerBarrel=teclado.nextDouble();
        Rango(p1.pricePerBarrel);
        System.out.println("el precio por barril es de"+" "+Rango(p1.pricePerBarrel)); 
    }  
}
    


