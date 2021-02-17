import java.util.*;

public class Recursion{
  public static void main(String[]args){
    
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    
    System.out.println(factorial(n)); 
    
    scan.close();
  }
  public static int factorial(int a){
    if(a>=1){
      return a*factorial(a-1);
    }else{
      return 1;
    }
  }
}