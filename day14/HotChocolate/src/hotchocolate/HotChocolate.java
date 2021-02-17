
package hotchocolate;


public class HotChocolate {

    public static final double tooHot = 185;
    public static final double tooCold = 160;
    
    public static void drinkHotChocolate(double cocoTemp) throws TooHotException, TooColdException{
        if(cocoTemp>=tooHot){
            throw new TooHotException();
        }
        else if(cocoTemp<=tooCold)
        {
            throw new TooColdException();
        }
    }
    
    public static void main(String[] args) {
        double currentTemp = 165;
        try{
            drinkHotChocolate(currentTemp);
            System.out.println("The chocolate was too goooooooooood !!!");
        }catch(TooHotException e){
            System.out.println("The chocolate is too hot !");
        }catch(TooColdException e){
            System.out.println("The chocolate is too cold");
        }
    }
    
   
    
}
