import java.util.*;
public class practiceSet01
{
    public static class Node
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
     public static int size = 0;

     static void addLast(int data)
     {
          Node newNode = new Node( data);
          size++;
          if(head == null)
          {
               head = tail = newNode;
               return;
          }

          tail.next = newNode;
          tail = tail.next;
          return;
      }
     public static boolean checkPalindrome(Node head)
     {
         Stack<Integer> st = new Stack<>();
         Node temp = head;
         while(temp != null)
         {
          st.push(temp.data);
          temp = temp.next;
         }

         temp = head;
         while(temp != null)
         {
          if(temp.data != st.peek())
          {
               return false;
          }

          st.pop();
          temp = temp.next;
         }

         return true;

     }

     
     public static void main ( String args[]) 
{
     practiceSet01 ll = new practiceSet01();

     ll.addLast(1);
     ll.addLast(2);
     ll.addLast(3);
     ll.addLast(4);
     ll.addLast(3);
     ll.addLast(2);
     ll.addLast(1);
     // System.out.println(ll.getFirst());
      System.out.println(checkPalindrome(ll.head));

} 
 } 