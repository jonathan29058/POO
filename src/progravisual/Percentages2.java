
package progravisual;

import java.util.Scanner;

public class Percentages2 {
    private double a;
    private double b;
    private double c;
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        Percentages2 p1=new Percentages2();
        p1.a=teclado.nextDouble();
        p1.b=teclado.nextDouble();
        p1.c=0;
        if(p1.a>p1.b){
            p1.c=p1.b/p1.a;
            System.out.println(p1.b+"es un"+p1.c*100+"%"+ "de"+p1.a);
        }else{
            p1.c=p1.a/p1.b;
            System.out.println(p1.a+" "+"es un"+" "+p1.c*100+"%"+" "+ "de"+" "+p1.b);
        }
    }
}
