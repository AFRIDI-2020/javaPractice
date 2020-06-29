import java.util.*;

public class Loop{
  public static void main(String[]args){
    
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    
    for(int i=1;i<=10;i++)
    {
      System.out.println(n + " * "+i+" = "+(n*i));
    }
    
    scan.close();
  }
}