package progravisual;

import java.util.Scanner;

public class Insurance {
    private static int actual;
    private static int nacimiento;
    
    public static void prima(int actual,int nacimiento){
        Insurance.actual=actual;
        Insurance.nacimiento=nacimiento;
        int edad=actual-nacimiento;
        int contador=0,aux;
        for(int i=10;i<edad;i++){
            contador++;
            aux=contador;
        }
        aux=+15;
        System.out.println("la prima total seria"+aux*20);
    }
    
    
    public static void main(String[]args){
        Scanner teclado= new Scanner(System.in);
        Insurance precio=new Insurance();
        System.out.println("Dame el año actual");
        precio.actual=teclado.nextInt();
        System.out.println("Dame tu año de nacimiento");
        precio.nacimiento=teclado.nextInt();
        prima(actual,nacimiento);
        
    }
    
}
