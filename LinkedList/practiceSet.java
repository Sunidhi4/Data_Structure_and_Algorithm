import java.util.*;
public class practiceSet
{
        static class Node{
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
  public void addFirst(int data)  //T.C = O(1)
    {
   
        //step1 -> create new node
        Node newNode = new Node(data);
          size++;
             if(head == null)
             {
                head = tail = newNode;
                return;
             }  
        //step2 -> newNode next = head
        newNode.next = head;

        //step3 -> head = newNode
        head = newNode;
    }

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

 static Node ogHead;
static Node ogTail;

public static void addLast(Node curr)
{
        ogTail.next = curr;
        ogTail = curr;
}

public static Node  addNodes(Node curr, int m)
{
        while(curr != null && m>0)
        {
                Node currKaNext = curr.next;
                curr.next = null;

                addLast(curr);

                curr = currKaNext;
                m--;
        }

        return curr;
}
static void deleteNodes(Node head, int m, int n)
{
Node dummy = new Node(-1);
ogHead = dummy;
ogTail = dummy;

Node curr = head;
int N =n;

while(curr != null)
{
      curr =  addNodes(curr,m);

        while(N>0 && curr != null)
        {
                curr = curr.next;
                N--;
        }
           N=n;
        
}
  print (dummy.next);   
}

   public static void print(Node dummy)
   {
        while(dummy != null)
        {
                System.out.print(dummy.data+" -> ");
                dummy = dummy.next;
        }

        System.out.println("null");
   }    
public static void main ( String args[]) 
{
       
LinkedList ll = new LinkedList();
ll.addLast(1);
ll.addLast(2);
ll.addLast(3);
ll.addLast(4);
ll.addLast(5);
ll.addLast(6);
ll.addLast(7);
ll.addLast(8);
int m =2,n=2;

deleteNodes(head, m , n);
} 
} 