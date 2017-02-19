/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios02;

import java.util.Random;

/**
 *
 * @author Propietario
 */
public class Twodice {
    private Integer numerito;
    public Twodice(){
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
