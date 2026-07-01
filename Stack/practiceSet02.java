import java.util.*;
public class practiceSet02
{
    public static String simplifyPath(String s)
    {
        String[] path = s.split("/");
        Stack<String>st = new Stack<>();

        for(int i=0; i<path.length; i++)
        {
            String curr = path[i];

            if(curr.equals(".."))
            {
                if(st.size()>0)st.pop();
            }
            else if(curr.equals(".") || curr.equals("")){}

            else{
                st.push(curr);
            }
        }

        StringBuilder sb = new StringBuilder();

        while(st.size()>0)
        {
            sb.insert(0,"/"+st.pop());
        }

        if(sb.length() == 0)return "/";

        return sb.toString();
    }
     public static void main ( String args[]) 
{
     String s1 = "/apnacollege/";
     String s2 = "/.../a/../b/c/../d/./";

     System.out.println(simplifyPath(s1));
     System.out.println(simplifyPath(s2)); 
} 
 } 