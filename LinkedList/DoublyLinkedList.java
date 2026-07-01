public class  DoublyLinkedList
{
     
     public static class Node
     {
          int data;
          Node next;
          Node prev;

          public  Node(int data)
          {
               this.data = data;
               this.next = next;
               this.prev = prev;

          }
     }

     public static Node head;
     public static Node tail;
     public static int size;

     public void addFirst(int data)
     {
          Node newNode = new Node(data);
          size++;
          if(head == null)
          {
               head = tail = newNode;
               return;
          }

          newNode.next = head;
          head.prev = newNode;
          head = newNode;
     }
     
     public void addLast(int data)
     {
          Node newNode = new Node(data);
          size++;
          if(head == null)
          {
               head = tail = newNode;
               return;
          }

          tail.next = newNode;
          newNode.next = null;
          newNode.prev = tail;
          tail = newNode;
     }
     public int removeFirst()
     {
          if(head == null)
          {
               System.out.println("Doubly LinkedList is empty !");
               return Integer.MIN_VALUE;
          }

          if(size == 1)
          {
               int val = head.data;
               head = tail = null;
                size = 0;
                return val;
          }

          int val = head.data;
          head = head.next;
          head.prev = null;
          size--;
          return val;
     }

     public int removeLast()
     {
          if(head == null)
          {
               System.out.println("Doubly LinkedList is Empty !");
               return Integer.MIN_VALUE;
          }

          if(size == 1)
          {
               int val = head.data;
               head = tail = null;
               size = 0;
               return val;
          }

          //  int val = tail.data;
          // tail = tail.prev;
          // tail.next = null;
          // size--;
          // return val;
           Node prev = head;
        for(int i=0; i<size-2; i++)
        {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

     }
      
      public void reverse()
      {
          Node curr = head;
          Node prev = null;
          Node next;

          while(curr != null)
          {
               next = curr.next;
               curr.next = prev;
               curr.prev = next;
               prev = curr;
               curr = next;
          }

          head = prev;
      }
     public void print()
     {
          Node temp = head;

          while(temp != null)
          {
               System.out.print(temp.data+" <-> ");
               temp = temp.next;
          }
          System.out.println("null");
     }

     public static void main ( String args[]) 
{
     DoublyLinkedList dll = new DoublyLinkedList();

     dll.addFirst(3);
     dll.addFirst(2);
     dll.addFirst(1);

     dll.print();
     System.out.println(dll.size);

     dll.removeFirst();
     dll.print();
     System.out.println(dll.size);

     dll.addLast(7);
     dll.print();

     dll.removeLast();
     dll.print();

     dll.reverse();
     dll.print();


} 
 } 