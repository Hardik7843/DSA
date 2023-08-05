
 
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

    /*
     * Inserting element at starting index of linked list
     * What is needed: 
     *  => Creation of new node to put new element
     *  => Shift head to new node
     *  => 
     */
    
    //insert the elemetn at the first index
    public void insertFirst(int val)
    {
        Node node = new Node(val);     
        node.next = head;              
        head = node;                   
        if(tail == null)
        {
            tail=head;
        }
        size +=1 ;
    }

    //insert the element at last index 
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

    //inser element at index by linearly traversing the array
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

    public void recursiveinsert(int value , int index)
    {
        
    }

    //this is to determine whether there is cycle or not
    public boolean hasCycle(Node head) 
    {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null )
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }

    //Thisfunction is return the length of cycle
    public int lengthcycle(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null )
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                int length = 0;
                do
                {
                    slow = slow.next;
                    length++;
                }
                while(slow != fast);
                return length;
            }
        }
        return 0;
    }

    //Functions to merger the two sorted linked list
    public static SinglyLinkedList mergeTwoLists(SinglyLinkedList l1, SinglyLinkedList l2) 
    {
        Node i = l1.head;
        Node j = l2.head;
        SinglyLinkedList merge = new SinglyLinkedList();
        

        while(i != null && j != null )
        {
            if( i.value < j.value )
            {
                merge.insertLast(i.value);
                i = i.next;
            }
            else
            {
                merge.insertLast(j.value);
                j = j.next;
            }
        }

        while( i != null )
        {
            merge.insertLast(i.value);
            i = i.next;
        }
        
        while( j != null )
        {
            merge.insertLast(j.value);
            j = j.next;
        }

        return merge;
    }

    // delete first node of linked list 
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

    // delete the last node of linked list
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

    // get element at specified index element
    public Node get(int index)
    {
        Node current = head;
        for(int i =0;i<index;i++)
        {
            current = current.next;
        }
        return current;
    }

    // display the linked list 
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

    //Method to return middle of linkedlist
    public static Node middNode(Node head)
    {
        Node s = head;
        Node f = head;

        while(f != null && f.next != null )
        {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    private class Node  // node class is reprensting node in linkedlist
    {
        private int value;  // value to be contain by linked list
        private Node next;  // reference to the next node

        public Node()
        {

        }

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


    // Function to reverse the linkedlist
    public Node reverseList(Node head) 
    {
        if(head == null )
            return null;
        Node prev = null;
        Node pres = head;
        Node next = head.next;

        while( pres != null )
        {
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null)
            next = next.next;
        }
        return prev;
    }

    public static void main(String[] args) 
    {
        SinglyLinkedList l = new SinglyLinkedList();
        SinglyLinkedList p = new SinglyLinkedList();

        l.insertLast(1);
        l.insertLast(3);
        l.insertLast(5);
        l.insertLast(7);
        l.insertLast(8);

        p.insertFirst(89);
        p.insertLast(1);
        p.insertLast(9);
        p.insertLast(10);
        p.insertLast(11);

        l.display();
        p.display();

        // Node j = p.head;
        // Node i = l.head;
        SinglyLinkedList  ans  = mergeTwoLists(l , p);

        ans.display();
    }
}