package linkedlisttelusko;

public class MyLinkedList 
{
    Node head;
    
    public void insert(int mdata)
    {
        Node node = new Node();
        node.data = mdata;
        node.next = null;
      
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while(n.next!=null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
    
    public void show()
    {
        Node node = new Node();
        node = head;
        while(node.next!= null)
        {
            System.out.println(node.data);
            node = node.next;
        } 
        System.out.println(node.data);
    }
    
    public void insertAtStart(int mData)
    {
        Node node = new Node();
        node.data = mData;
        node.next = head;
        head = node;
    }
    
    public void insertAt(int position, int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(position == 0)
        {
            insertAtStart(data);
        }
        else
        {
            Node n = head;
            for(int i=0; i<position-1; i++)
            {
                n=n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    
    public void removeAt(int position)
    {
        if(position == 0)
        {
            head = head.next;
        }
        else
        {
            Node n = head;
            Node temp = new Node();
            for(int i=0;i<position-1;i++)
            {
                n = n.next;
            }
            temp= n.next;
            n.next = temp.next;
            temp = null;
        }
    }
}
