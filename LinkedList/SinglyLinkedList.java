import java.util.LinkedList;

import javax.xml.namespace.QName;
 
public class SinglyLinkedList
{
    private Node head;   // head,tail and size are 
    private Node tail;   // nessesory variables for 
    private int size;    // any ll
    public SinglyLinkedList()
    {
        this.size = 0;  // After creating a linked list this 
                        // cunstructor will be called for 
                        // allocating size
    }

    public void insertFirst(int val)
    {
        Node node = new Node(val);     // this will add elements at the
        node.next = head;              // very first node i.e before head
        head = node;                   // 
        if(tail == null)
        {
            tail=head;
        }
        size +=1 ;
    }

    public void insertLast(int val)
    {
        if(tail == null)
        {
            insertFirst(val);
        }
        else
        {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size += 1;
        }
    }

    public void insertIndex (int val , int index)
    {
        if(index == 0)
        {
            insertFirst(val);
            return;
        }
        else if(index == (size))
        {
            insertLast(val);
            return;
        }
        
        Node tempNode = head;
        for(int i = 1;i<index;i++)
        {
           tempNode = tempNode.next;
        }
        Node node = new Node(val , tempNode.next);
        tempNode.next = node;
        size += 1;
    }

    public int deletFirst()
    {
        int val = head.value;
        head = head.next;
        if(head == null)
        {
            tail = null;
        }
        size --;
        return val;
    }

    public int deleteLast()
    {
        if(size<=1)
        {
            return deletFirst();
        }
        
        Node secondlast = get(size-2);
        int val = tail.value;
        tail = secondlast;   
        tail.next= null;
        return val; 
    }

    public Node get(int index)
    {
        Node node = head;
        for(int i =0;i<index;i++)
        {
            node = node.next;
        }
        return node;
    }

    public void display()
    {
        Node temNode = head;
        
        while(temNode != null)
        {
            System.out.print(temNode.value +" -> ");
            temNode = temNode.next;
        }
        System.out.println("END");
    }

    private class Node  // node class is reprensting node in linkedlist
    {
        private int value;  // value to be contain by linked list
        private Node next;  // reference to the next node

        public Node(int value)      // this cunstructor will add value  
        {                           // while creating new node
            this.value = value;
        }

        public Node(int value,Node next)  // this will add value as
        {                                 // well as the next node
            this.value = value;           // while creating the new node
            this.next = next; 
        }
    }
    
}