
package progravisual;

import java.util.Scanner;

public class SammysRentalPriceWithMethods {
    public static int tiempo(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el tiempo que desea alquilar el equipo (minutos) ");
        int n=teclado.nextInt();
        return n;
    }
    
    public static void Nombre(){
        System.out.println("*AquÌ va el lema de la empresa*");
    }
    
    public static void Calcular(int n){
        int Horas=n/60;
        n=n%60;
        double precio=480.00;
        double costo=Horas*precio + (precio/60)*n;
        System.out.println("DETALLES DEL ALQUILER");
        System.out.println("Precio del alquiler por hora $"+precio);
        if(Horas>0){
            System.out.println("Tiempo que se desea rentar "+Horas+" hora "+n+" minutos");
        }else{
            System.out.println("Tiempo que se desea rentar  "+n+" minutos");
        }
        System.out.println("Total a pagar: $"+costo);
        
    }
    public static void main(String[]args){
        int t=tiempo();
        Nombre();
        Calcular(t);
    }
    
    
}
