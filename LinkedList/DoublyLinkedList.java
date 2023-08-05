public class DoublyLinkedList 
{

    // When we make object of DLL it should come with
    // head node init. that's why we have to declare it 
    // inside of the DoublyLinkedList class.
    private Node head; 
    private Node last;
    private int size;

    /*
     * Let's write some features of our doublylinked list class
     * these features will help us playing with DLL.
     */

   

    

    // Method to show view of linkedlist
    public void show()
    { 
        // Take one pointer which will be used to pick one node at 
        // a time. the value will of this pointer will be moved to next
        Node forward = head;
        Node backward = null;
        while(forward != null)
        {
            System.out.print(forward.value + " <=> ");
            backward = forward;
            forward = forward.next;
        }
        System.out.print("End");
        System.out.println();

        System.out.println("Reverse order");
        while(backward != null)
        {
            System.out.print(backward.value + " <=> ");
            backward = backward.prev;
        }
        System.out.print("Start");
    }

    // Method to insert node at first index
    public void insertFirst(int value)
    {
        Node newnode = new Node(value);
        newnode.next = head;
        newnode.prev = null;
        if(head != null ) // when the DLL will have only one node then head will point the null in that case
        {                 //  just connect the newnode to that one node and make new node as head
            head.prev = newnode;
        }
        head  = newnode;
    }


    //Method to insert element at last
    public void append(int value)
    {
         Node newnode = new Node(value); 
        if (head == null)
        {
            head = newnode;
            newnode.prev = null;
            newnode.next = null;
            return;
        }
        Node pointer = head; 
       
        while(pointer.next != null)
        {
            pointer = pointer.next;
        }
        newnode.prev = pointer;
        pointer.next = newnode;
        newnode.next = null;
    }

    //Method to insert element at specified index 
    //Insert in middle 
    public void insert(int index , int value )
    {
        if(head.next == null )
        {
            append(value);
            return;
        }
        if(index == 0)
        {
            insertFirst(value);
            return;
        }
        Node node1 = head;
        Node node2 = head.next;
        Node newNode = new Node(value);
        
        for(int i = 0 ; i < index-1 ; i++)
        {
            node1 =  node1.next;
            node2 = node1.next;
        }
        newNode.next = node2;
        newNode.prev = node1;
        node1.next = newNode;
        node2.prev = newNode;
    }

    // Method the delete last node 
    // public void deleteLast()
    // {
    //     Node pointer = head;
    //     while ( pointer.next != null)
    //     {
    //         pointer = pointer.next;
    //     }
    //     pointer.prev = null;
    // }

    public DoublyLinkedList()
    {
        this.size = 0;
    }

    // Method to access node at index
    public Node get(int index)
    {
        Node current = head;
        for(int i =0;i<index;i++)
        {
            current = current.next;
        }
        return current;
    }

    private class Node
    {
        int value;
        Node prev;
        Node next;

        //Constructor for creating node in heap memory
        public Node(int value)
        {
            this.value = value; //this. value is variable of class
                                // and value is local variable passed 
                                // constructor
        }
    }
    
}
