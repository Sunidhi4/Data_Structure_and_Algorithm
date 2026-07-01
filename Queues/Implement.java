import java.util.*;
public class Implement
{ 
    static class Stack
    {
          Deque<Integer> dq = new LinkedList<>();

         

          public void push(int data)
          {
            dq.addLast(data);
          }

          public  int pop()
          {
            int top = dq.removeLast();
            return top;
          }

          public  int peek()
          {
            return dq.getLast();
          }
    }

    static class Queue
    {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data)
        {
            deque.addLast(data);
        }

        public int remove()
        {
            return deque.removeFirst();
        }

        public int peek()
        {
            return deque.getFirst();
        }
    }
     public static void main ( String args[]) 
{
     Stack s = new Stack();
     s.push(1);
     s.push(2);
     s.push(3);

     System.out.println("peek = "+s.peek());
     System.out.println(s.pop());
     System.out.println(s.pop());
     System.out.println(s.pop());

System.out.println("*******************Queue*******************");
     Queue q = new Queue();
     q.add(1);
     q.add(2);
     q.add(3);

     System.out.println("peek = "+q.peek());
     System.out.println(q.remove());
     System.out.println(q.remove());
     System.out.println(q.remove());
} 
 } 