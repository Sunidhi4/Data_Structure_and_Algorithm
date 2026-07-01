public class practiceSet03
{
    static class Node 
    {
        int data ;
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
public static void arrange(Node head)
{
    Node temp1 = new Node(-1);
    Node next1 = temp1;
    Node prev = new Node(-1);
    Node temp2 = new Node(-1);
    Node next2 = temp2;
    Node curr = head;

    while(curr != null)
    {
        if((curr.data)%2  == 0)
        {
            temp1.next = curr;
            temp1 = temp1.next;
        
        }
        else
        {
           temp2.next = curr;
           temp2 = temp2.next;
        }

        curr = curr.next;
    }
 
     temp1 = next2.next;
    print(next1.next); 
    print(next2.next);
}

public static void print(Node temp)
{
    while(temp != null)
    {
        System.out.print(temp.data+" -> ");
        temp = temp.next;
    }

    System.out.println("null");
} 
     public static void main ( String args[]) 
{
     LinkedList ll = new LinkedList();
     ll.addLast(8);
     ll.addLast(2);
     ll.addLast(4);
     ll.addLast(1);
     ll.addLast(7);
     ll.addLast(9);
     ll.addLast(2);
     ll.addLast(5);
     ll.addLast(6);

     arrange(head);
} 
 } 