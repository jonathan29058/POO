package progravisual;

import java.util.Scanner;

public class Salary {
    private Integer extras;
    private Integer regulares;
    
    public Salary(Integer extras,Integer regulares){
        this.extras=extras;
        this.regulares=regulares;
    
    }
    public void extras1(Integer a){
        
        
    }
    public void normal(Integer a){
        
    }
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);
        Salary p=new Salary(0,0);
        String d=teclado.nextLine();
        if(d=="si"){
        System.out.println("Ingresa las horas regulares");
        p.regulares=teclado.nextInt();
    }else{
            System.out.println("ingresa las horas extras");
            p.extras=teclado.nextInt();
        }
        
    }
}
