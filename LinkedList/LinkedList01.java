public class LinkedList01
{
    public static class Node{
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
    public static int size;

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

    public void add(int idx, int data)  // T.c = O(n)
    {
        if(idx == 0)
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i < idx-1)
        {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst()
    {
        if(size == 0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1)
        {
           int val = head.data;
           head = tail = null;
           size = 0;
           return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast()
    {
        if(size == 0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
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

    public int iterativeSearch(int key)  //T.C = O(n)
    {
        int i=0;
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == key)
            {
                return i;
            }
        
                temp = temp.next;
                i++;

        }

        return -1;
    }

     public int helper(Node head, int key)  //O(n)
     {
          if(head == null)
          {
            return -1;
          }

          if(head.data == key)
          {
            return 0;
          }
          int idx = helper(head.next, key);
          if(idx == -1)
          {
            return -1;
          }

          return idx+1;
     }
    public int recursiveSearch(int key)
    {
        return helper(head, key);
    }

    public void reverse()  // T.c = O(n)
    {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;

    }

    public void deleteNthfromEnd(int n)
    {
        int sz = 0;
        Node temp = head;
        while(temp != null)
        {
            temp = temp.next;
            sz++;
        }

        if(n == sz)
        {
            head = head.next;
            return;
        }

        int i =1;
        int iToFind = sz-n;
        Node prev = head;
        while( i < iToFind)
        {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return ;
    }

    public Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean checkPalindrome()
    {
        if(head == null || head.next == null)
        {
            return true;
        }

        //step1 - find mid
          Node midNode = findMid(head);
        //step2 - reverse second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        Node right = prev;
        Node left = head;
        //step3 - check left half and right half

        while(right != null)
        {
            if(left.data != right.data)
            {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }
     public static void main ( String args[]) 
{
    LinkedList01 ll = new LinkedList01(); 
    
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(3);
    ll.addLast(4);
    ll.add(2, 9);
    ll.print();
    System.out.println("size : " +ll.size);
    ll.removeFirst();
    ll.print();
    ll.removeLast();
    ll.print();
    System.out.println("size : "+ll.size);

    System.out.println(ll.iterativeSearch(3));
    System.out.println(ll.iterativeSearch(10));
    System.out.println(ll.recursiveSearch(3));

    ll.reverse();
    ll.print();

    ll.deleteNthfromEnd(2);
    ll.print();

    System.out.println(ll.checkPalindrome());

} 
 } 