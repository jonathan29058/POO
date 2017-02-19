
package ejercicios02;

public class Bread {
    private String tipoP;
    private Integer rodaja;
    static String lema="El que se requiera";
  
     public Bread(String tipo,Integer rodaja){
         this.tipoP=tipo;
         this.rodaja=rodaja;
      
     }

    public String getTipoP() {
        return tipoP;
    }
    public Integer getRodaja() {
        return rodaja;
    }
    
}
