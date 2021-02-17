import java.util.*;

public class Array{
  public static void main(String[]args){
    
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    int[]array = new int[10000];
    
    for(int i=0;i<n;i++)
    {
      array[i] = scan.nextInt();
    }
    
    for(int j=n-1;j>=0;j--)
    {
      System.out.print(array[j]+" ");
    }
    
    System.out.println();
    scan.close();
  }
}