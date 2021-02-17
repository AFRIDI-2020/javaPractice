
package linkedlist;

public class Node {
    //properties
    Node next;
    int data;
    
    //constructor
    public Node(int newData){
        data = newData;
    }
    
    public Node(int newData, Node newNext){
        data = newData;
        next = newNext;
    }
    
    //getter method
    
    public int getData(){
        return data;
    }
    public Node getNode(){
        return next;
    }
    
    //setter method
    
    public void setData(int newData){
        data = newData;
    }
    
    public void setNext(Node newNext){
        next = newNext;
    }
    
}
