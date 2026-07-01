public class practiceSet04
{
    static class Node{
        int data;
        Node next;
        
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

   static Node head;
   static Node tail; 
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

public static void merge(Node head1, Node head2, Node head3)
{
    
}
     public static void main ( String args[]) 
{
     LinkedList ll1 = new LinkedList();
     LinkedList ll2 = new LinkedList();
     LinkedList ll3 = new LinkedList();

     ll1.addLast(1);
     ll1.addLast(2);
     ll2.addLast(3);

     ll2.addLast(7);
     ll2.addLast(8);
     ll2.addLast(9);

     ll3.addLast(4);
     ll3.addLast(5);
     ll3.addLast(6);

     merge(ll1.head , ll2.head, ll3.head);

} 
 } 