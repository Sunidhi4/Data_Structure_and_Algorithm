import java.util.*;
public class PracticeSet02
{
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size =0;

 static class LinkedList
{
  
    public void addLast(int data)   // T.C = O(1)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
}
    public static void main ( String args[]) 
{
    LinkedList ll = new LinkedList();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);

    Node gar = head;
    while(gar != null)
    {
        System.out.print(gar.data+" -> ");
        gar = gar.next;
    }

    System.out.println("null");

    Node curr1 = head;
    Node curr2 = head;
    Node prev1 = new Node(-1);
    Node prev2 = new Node(-1);
    Node next1 = new Node(-1);
    Node next2 = new Node(-1);

    int idx1 = 1;
    int idx2 = 3;

    for(int i=0; i<idx1; i++)
    {
        prev1 = curr1;
        curr1 = curr1.next;
        next1 = curr1.next;
    }
    for(int i=0; i<idx2; i++)
    {
        prev2 = curr2;
        curr2 = curr2.next;
        next2 = curr2.next;
    }
    curr1.next = next2;
    curr2.next = next1;
    prev1.next = curr2;
    prev2.next = curr1;

    Node temp = head;
    while(temp  != null)
    {
        System.out.print(temp.data +" -> ");
        temp = temp.next;
    }

    System.out.println("null");
    

} 
 } 