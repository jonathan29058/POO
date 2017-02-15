
package progravisual;
public class Sandwich {
    private String ingredient;
    private String bread;
    private Double price;
    
  
    public String getIngredient(){
        return ingredient; 
    }
    
    public void setIngredient(String i){
        this.ingredient=i;
    }
    
    public String getBread(){
        return bread; 
    }
    
    public void setBread(String p){
        this.bread=p;
    }
    
    public Double getPrice(){
        return price; 
    }
    
    public void setPrice(Double r){
        this.price=r;
    }
    
}
