package ejercicios02;

public class Fivedice {
    private Die[] dados;
    private Integer numeroDados;
    
    public Fivedice(Integer n){
        numeroDados=n;
        dados=new Die[n];
        for(int i=0;i<n;i++){
            dados[i]=new Die();
        }
    }
    public void lanzar(){
        for(int i=0;i<this.numeroDados;i++){
            dados[i].lanzar();
        }
        
    }
    public Integer resultado(){
        int[]contador={0,0,0,0,0,0};
        for(int i=0;i<numeroDados;i++){
            contador[dados[i].getNumerito()-1]++;
        }
        int mayor=0;
        for(int i=0;i<6;i++){
            if(contador[i]>mayor){
                mayor=contador[i];
            }
        }
        return mayor;
    }
    public static void main(String[]args){
        Fivedice cesar=new Fivedice(5);
        Fivedice jose=new Fivedice(5);
        cesar.lanzar();
        jose.lanzar();
        if(cesar.resultado()==jose.resultado()){
            System.out.println("tablas");
        
    }else if(cesar.resultado()>jose.resultado()){
        System.out.println("gano cesar");
        
    }else{
        System.out.println("gano jose");
    }
    }
}
