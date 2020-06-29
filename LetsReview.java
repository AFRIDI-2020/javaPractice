import java.util.*;

public class LetsReview{
  
  
  public static void main(String[]args){
    
    Scanner scan = new Scanner(System.in);
    
    
    int testCase = scan.nextInt();
    scan.nextLine();
    for(int j=0;j<testCase;j++){
      String s = scan.nextLine();
      char[]ch = s.toCharArray();
      
      for(int i=0;i<s.length();i++)
      {
        if(i%2==0)
        {
          System.out.print(ch[i]);
        }
        
      }
      
      System.out.print(" ");
      
        for(int i=0;i<s.length();i++)
      {
        if(i%2!=0)
        {
          System.out.print(ch[i]);
        }
        
      }
   
  }
    scan.close();
}
}