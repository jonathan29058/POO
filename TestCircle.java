
package ejercicios02;

public class TestCircle {
    public static void main(String[] args) {
         Circle circulo1=new Circle();
         circulo1.setRadio(4.5,5.2,5.8);
         System.out.println("Radio= "+circulo1.getRadio());
         System.out.println("Diametro= "+circulo1.getDiametro());
         System.out.println("Area= "+circulo1.getArea());
         Circle circulo2=new Circle(20.5,4.6,5.6);
         System.out.println("Radio= "+circulo2.getRadio());
         System.out.println("Diametro= "+circulo2.getDiametro());
         System.out.println("Area= "+circulo2.getArea());
         Circle circulo3=new Circle(0.0,5.7,4.5);  
         System.out.println("Radio= "+circulo3.getRadio());
         System.out.println("Diametro= "+circulo3.getDiametro());
         System.out.println("Area= "+circulo3.getArea());
     }
}
