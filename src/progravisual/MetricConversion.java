package progravisual;

import java.util.Scanner;

public class MetricConversion {
    private Double valor;
    public MetricConversion(Double valor){
        this.valor=valor;
    }
    public Double Pulgadas(Double x){
        return x*2.54;
    }
    public Double Galon(Double y){
        return y*3.7854;
    }
    
    public static void main(String[]args){
    Scanner teclado=new Scanner(System.in);
    MetricConversion v1=new MetricConversion(0.0);
    v1.valor=teclado.nextDouble();
    
    System.out.println("EL valor que me diste convertido a pulgadas es"+v1.Pulgadas(v1.valor));
    System.out.println("EL valor que me diste convertido de galones a litros es"+v1.Galon(v1.valor));
}
}
