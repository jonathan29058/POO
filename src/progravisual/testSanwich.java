
package progravisual;

public class testSanwich {
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
    
    public static void main(String[] args) {
    
        Sandwich s1=new Sandwich();
        s1.setIngredient("meat");
        s1.setBread("wheat");
        s1.setPrice(5.0);
        
        System.out.println(s1.getIngredient());
        System.out.println(s1.getBread());
        System.out.println(s1.getPrice());
    }
    
}
