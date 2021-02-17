import java.util.*;

public class DictionariesAndMaps{
  
  
  
  public static void main(String[]args){
    
    Scanner scan = new Scanner(System.in);
    Map<String, String> map = new HashMap<String, String>();
    int n = scan.nextInt();
    scan.nextLine();
    
    
    for(int i=0;i<n;i++){
    
      String name = scan.next();
      String number = scan.next();
      
      map.put(name, number);
    }
    
    while(scan.hasNext()){
      
      String query = scan.next();
      if(!map.isEmpty()){
        String result = map.get(query);
        
         if(result ==null)
      {
        System.out.println("Not found");
      }
      else{
        System.out.println(query+"="+result);
      }
    }
      
    
  }
   scan.close();
  }
}
