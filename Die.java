package ejercicios02;

import java.util.Random;

public class Die {
    private Integer numerito;
    public Die(){
        lanzar();
    }
    public void lanzar(){
        Random random=new Random();
        numerito=random.nextInt(6)+1;
    }
    public Integer getNumerito(){
        return numerito;
    }
    public static void main(String[]args){
        Die dado=new Die();
        Die dado2=new Die();
        System.out.println(dado.getNumerito());
     //   System.out.println(dado2.getNumerito());
        
    }
    
}
