public class LinkedList04
{
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

     public void addLast(int data)   // T.C = O(1)
    {
        Node newNode = new Node(data);
        
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

     public void print()
    {
        if(head == null)
        {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    public void zigZag()
    {
        //find mid
       Node slow = head;
       Node fast = head.next;

       while(fast != null && fast.next != null)
       {
        slow = slow.next;
        fast = fast.next.next;
       } 

       Node mid = slow;
        //reverse 2nd half

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL , nextR;

        //alt merge/ zigzag merge

        while(left != null && right != null)
        {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
     public static void main ( String args[]) 
{
     LinkedList04 ll = new LinkedList04();
     ll.addLast(1);
     ll.addLast(2);
     ll.addLast(3);
     ll.addLast(4);
     ll.addLast(5);

     ll.print();

     ll.zigZag();

     ll.print();

} 
 } 