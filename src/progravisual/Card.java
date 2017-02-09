
package progravisual;

//import java.lang.Math.random;

public class Card {
    private String figura;
    private Integer numero;
    
    
    public void cartas(String figura,Integer numero){
        this.figura=figura;
        this.numero=numero;
          
        }

    private static class card {

        public card(String string, int i) {
        }
    }
    public class PickTwoCard{
        private Card[] cartas;
    }
    
    Card c1= new Card();
    
    
    public void Picktwocards(){
     //   cartas=new card[52];
        int indice=0;
        String [] figura={"H","S","O","C"};
        int figurita=0;
        do{
            for(int i=1;i<14;i++){
        //        carta[indice]=new card(figura[figurita],i);
                indice++;
            }
            figurita++;
        }while(figurita<4);
        
    }
 //   public Card damecarta(){
      //  return cartas[random.nextInt(52)];
  //  }
   // public void main(String[]args){
      //  PickTwoCard mazo=new PickTwoCard();
     //   Card cartita=mazo.damecarta();
    }

