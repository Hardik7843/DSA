public class CircularLinkedList 
{


    public class Node
    {
        int value;
        Node next;

        public Node(int value)
        {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    public CircularLinkedList()
    {
        this.head = null;
        this.tail = null;
    }

    // Method to append element in circular linked list
    public void append(int value)
    {
        if(head == null)
        {
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    //Method to display circular linkedlist
    public void show()
    {
        Node pointer = head;
        System.out.print("Start -> ");
        do
        {
            System.out.print(pointer.value + " -> ");
            pointer = pointer.next;
        }
        while( pointer != head );
        System.out.print(" Start");
    }



}
