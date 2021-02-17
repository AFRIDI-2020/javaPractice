
package Inheritance;

public class Teacher extends Person{
    private String qualification;
    
    public String getQualification(){
        return qualification;
    }
    
    public void setQualification(String qualification){
        this.qualification = qualification;
    }
    
    @Override
    public void displayInfo(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());
    }
}