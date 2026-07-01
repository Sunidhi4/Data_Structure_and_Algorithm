import java.util.*;
public class Stack
{
     public static  boolean isValid (String s)
     {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0; i<n; i++)
        {
            char c = s.charAt(i);
            if(c=='(' || c== '{' || c == '[')
            {
                st.push(c);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                else if(c == ')' && st.peek() != '(')
                {
                    return false;
                }
                else if(c == '}' && st.peek() != '{')
                {
                    return false;
                }
                else if(c == ']' && st.peek() != '[')
                {
                    return false;
                }

                st.pop();
            }
        }

        if(st.isEmpty())
        {
            return true;
        }

        return false;
     }

     //leetcode 234

     public static boolean isPalindrome(ListNode head)
     {
        Stack<Integer> st = new Stack<>();

        ListNode curr = head;

        while(curr != null)
        {
            st.push(curr.val);
            curr = curr.next;
        }

        curr = head;

        while(curr != null)
        {
            if(curr.val != st.peek())
            {
                return false;
            }
            st.pop();
            curr = curr.next;
        }

        return true;
     }

     //leetcode 71
     public String simplifyPath(String path)
     {
        String [] paths = path.split("/");

        Stack<String> st = new Stack<>();

        for(int i=0; i<paths.length; i++)
        {
            String curr = paths[i];
            //System.out.println(curr);

            if(curr.equals(".."))
            {
                if(st.size() > 0) st.pop();
            }
            else if(curr.equals(".") || curr.equals(""))
            {
                //do Nothing
            }
            else
            {
                //folderName
                st.push(curr);
            }
        }

        StringBuilder sb = new StringBuilder();

        while(st.size() > 0)
        {
            sb.insert(0,"/"+st.pop());
        }

        if(sb.length() == 0)return "/";

        return sb.toString();
     }

     //leetcode 394

     public String decodeString(String s)
     {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch != ']')
            {
                st.push(ch);
            }
            else{
                //get a string until we see'['
                StringBuilder sb = new StringBuilder();
                while(st.size() > 0 && st.peek() != '[')
                {
                    sb.insert(0, st.pop());
                }

                String toRepeat = sb.toString();
                st.pop(); // removing '['
                //get the number before '['
                sb = new StringBuilder();
                while(st.size()>0 && st.peek()-'0' && st.peek()<='9')
                {
                    sb.insert(0, st.pop());
                }

                int count = Integer.parseInt(sb.toString());
                //repeat the string "count" times and push in stack
            }
        }
     }

     public static void main ( String args[]) 
{
     
} 
 } 