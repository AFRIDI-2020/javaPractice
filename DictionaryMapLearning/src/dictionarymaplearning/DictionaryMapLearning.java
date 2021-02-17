
package dictionarymaplearning;
import java.util.*;


public class DictionaryMapLearning {

   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        scan.nextLine();
        
        HashMap<String, String> hm = new HashMap();
        String name,number, query, result;
        
        for(int i=0;i<n;i++)
        {
            name = scan.next();
            number = scan.next();
            
            hm.put(name,number);
        }
        
        for(;;){
            
            query = scan.next();
            if(!hm.isEmpty()){
                result = hm.get(query);
                if(result==null){
                  System.out.println("Not found");
                }
                else{
                    System.out.println(query+"="+result);
                }
            }
            
        }
        
    }
    
}
