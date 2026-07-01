import java.util.*;
public class Stack01
{
    public static void pushAtBottom(Stack s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top = (int) s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str)
    {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length())
        {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty())
        {
            char curr = s.pop();
            result.append(curr);
        }

        // str = result.toString();
        return  result.toString();
    }

    public static void reverseStack(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
       int top = s.pop();
       reverseStack(s);
       pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s)
    {
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
     public static void main ( String args[]) 
{
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);

    pushAtBottom(s, 4);

    while(!s.isEmpty())
    {
        System.out.println(s.peek());
        s.pop();
    }
     
     String str = "Hello World";
     String result = reverseString(str);
     System.out.println(result);

     Stack<Integer> s1 = new Stack<>();
     s1.push(1);
     s1.push(2);
     s1.push(3);

     reverseStack(s1);
     printStack(s1);
     
} 
 } 