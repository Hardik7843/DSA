

public class LinkedListMain 
{
    public static void main(String[] args) 
    {
        SinglyLinkedList l = new SinglyLinkedList();
        l.insertFirst(89);
        l.insertLast(98);
        l.insertLast(9);
        l.insertLast(8);
        l.insertLast(89);
        l.display();
        System.out.println(l.deleteLast()); 
        l.display(); 
        
    }
}
