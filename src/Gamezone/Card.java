
package Gamezone;

public class Card {
    private String s;//espadas
    private String h;//corazones
    private String d;//diamantes
    private String c;//palos
    private Integer valor;//espadas
    
    private String palabra = "ejemplo";

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    StringBuilder sb = new StringBuilder (s);  
    
    
    public String agregarpalabra(String palabra){
      
        return palabra;
                
    }

    public String getS() {
        return s;
    }

    public void setS(String palabra) {
        this.s = palabra;
    }

    public String getH() {
        return h;
    }

    public void setH(String palabra) {
        this.h = palabra;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
    
}
