import java.util.Scanner;

public class Solution7 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                
                int size = s1.length();
                System.out.print(s1);
                for(int j=size; j<=15;j++)
                {
                  System.out.print(' ');
                }
                
                String s2 = String.valueOf(x);
                int size2 = s2.length();
                for(int k =size2;k<3;k++)
                {
                  System.out.print('0');
                }
                System.out.print(s2);
           
            }
            System.out.println();
            System.out.println("================================");
            
            sc.close();

    }
}



