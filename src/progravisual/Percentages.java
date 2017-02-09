
package progravisual;

public class Percentages {
    private double a;
    private double b;
    private double c;
    public static void main(String[]args){
        Percentages p1=new Percentages();
        p1.a=147.89;
        p1.b=1591.56;
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
