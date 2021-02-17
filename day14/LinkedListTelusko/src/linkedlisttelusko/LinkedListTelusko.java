package linkedlisttelusko;


public class LinkedListTelusko {

    public static void main(String[] args) {
        
        MyLinkedList list = new MyLinkedList();
        list.insert(10);
        list.insert(12);
        list.insert(12);
        list.insert(36);
        list.insertAtStart(63);
        list.insertAt(2, 123);
        list.insertAt(0,123);
        list.removeAt(0);
        list.removeAt(1);
        list.removeAt(1);
        list.show();
    }
    
}
