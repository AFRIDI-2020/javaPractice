package hackerrankpractice;
import java.util.Scanner;
import java.lang.Math;


public class HackerRankPractice {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int query = sc.nextInt();
        for(int i=0; i<query; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            int sum = 0;
            
            for(int j=0; j<n; j++){
                if(j==0){
                    sum += a + Math.pow(2, j) * b;
                }
                else{
                    sum += Math.pow(2, j) * b;
                } 
                System.out.print(sum);
                
                if(j<n-1){
                    System.out.print(" ");
                }
            }
            
            System.out.print("\n");
        }
    }
    
}
