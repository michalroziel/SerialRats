import java.io.Serializable;

public  abstract class Tier implements Serializable {


    private final String art;
    private int gewicht; 
    private int groesse;
    private boolean isHungry;
    
    
    public Tier( String pArt, int pGewicht, int pGroesse, boolean pIsHungry){
      
        art = pArt;
        gewicht = pGewicht;
        groesse = pGroesse;
        isHungry = pIsHungry;
      
      
    } 

    public abstract boolean eat(int pAmount);

    public abstract boolean roam( int pDistance);



    
    @Override
   public String toString(){
      
  
       return "printing animal : " + this.art + " weight: " + this.gewicht + " groesse: " 
       + this.groesse + " isHungry: " + this.isHungry;
      
     }

     // following the setters and getters :


     public void setGewicht( int pAmount){
        this.gewicht = pAmount;
     }

     public void setGroesse( int pAmount){
        this.groesse = pAmount;
     }

     public void setIsHungry( boolean pIsHungry){
        this.isHungry = pIsHungry;
     }

     public String getArt(){
        return this.art;
     }

     public int getGewicht(){
        return this.gewicht;
     }

     public int getGroesse(){
        return this.groesse;
     }

     public boolean getIsHungry(){
        return this.isHungry;
     }



    
    
  
  }