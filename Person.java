import java.util.*;


public class Person{

  private int age;
  
  Person(int initialAge){
    age = initialAge;
    if(age<0){
      System.out.println("Age is not valid, setting age to 0.");
      age = 0;
    }
  }
  
  public void amIOld(){
    
    if(age<13){
      System.out.println("You are young.");
    }
    else if(age>=13 && age<18){
      System.out.println("You are a teenager.");
    }
    else{
      System.out.println("You are old.");
    }
  } 
  
  public void yearPasses(){
    
    for(int i=0;i<3;i++){
      age++;
    }
  }
  
  public static void main(String[]args)
  {
    Scanner scan = new Scanner(System.in);
    
    int testCase = scan.nextInt();
    
    for(int j=0;j<testCase;j++){
    int a = scan.nextInt();
    
    Person person = new Person(a);
    person.amIOld();
    person.yearPasses();
    person.amIOld();
    }
    
    scan.close();
  }
}