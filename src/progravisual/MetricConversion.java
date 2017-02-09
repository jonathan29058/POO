package progravisual;

import java.util.Scanner;

public class MetricConversion {
    private static double valor;
    private static double a;
    private static double b;
    
    public static double Pulgadas(double x){
        return x*2.54;
    }
    public static double Galon(double y){
        return y*3.7854;
    }
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        MetricConversion v1=new MetricConversion();
        v1.valor=teclado.nextDouble();
        v1.a=Pulgadas(valor);
        v1.b=Galon(valor);
        System.out.println("EL valor que me diste convertido a pulgadas es"+v1.a);
        System.out.println("EL valor que me diste convertido de galones a litros es"+v1.b);
    }   
}