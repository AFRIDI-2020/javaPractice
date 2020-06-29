import java.util.*;

public class Solution3 {
  
  public static void main(String[]args){
  
    double mealCost,tip,tax,totalCost;
    int tipPercent,finalMealCost;
    int taxPercent;
    
    Scanner scan = new Scanner(System.in);
    
    mealCost = scan.nextDouble();
    tipPercent = scan.nextInt();
    taxPercent = scan.nextInt();
    
    tip = (mealCost*tipPercent)/100;
    
    tax = (mealCost*taxPercent)/100;
    
    totalCost = mealCost + tip + tax;
    finalMealCost = (int)totalCost;
    
    if((totalCost - finalMealCost)>=0.5)
    {
      System.out.println(finalMealCost+1);
    }
    else
    {
      System.out.println(finalMealCost);
    }
    
    
    scan.close();
    
  }
  
}
