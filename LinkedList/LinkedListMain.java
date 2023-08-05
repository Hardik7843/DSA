

public class LinkedListMain 
{
    public static void main(String[] args) 
    {
        SinglyLinkedList l = new SinglyLinkedList();
        SinglyLinkedList p = new SinglyLinkedList();
        // l.insertFirst(89);
        l.insertLast(1);
        l.insertLast(3);
        l.insertLast(5);
        l.insertLast(7);

        // p.insertFirst(89);
        p.insertLast(1);
        p.insertLast(9);
        p.insertLast(10);
        p.insertLast(11);

        l.display();
        System.out.println(l.deleteLast()); 
        l.display(); 


        // DoublyLinkedList dll = new DoublyLinkedList();
        // dll.insertFirst(9);
        // dll.insertFirst(4);
        // dll.insertFirst(10);
        // dll.append(24);
        // dll.insertFirst(35);
        // dll.insert(2, 69);
        // dll.insert(4, 34);
        // dll.show();

        // CircularLinkedList c = new CircularLinkedList();
        // c.append(20);
        // c.append(322);
        // c.append(2454);
        // c.show();
        
    }
}
