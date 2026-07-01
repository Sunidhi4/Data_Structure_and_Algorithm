Q. Removal adjacent letter ll

class Pair
{
     char chr;
     int freq;
 
     Pair( char chr, int freq)
     {
          this.chr= chr;
          this.freq= freq;
     }
}
 
class Solution {
    public String removeDuplicates(String s, int k)
    {
        Stack<Pair>st= new Stack<>();
 
        for( int i=0;i< s.length();i++)
        {
             char ch = s.charAt(i);
 
            if( st.isEmpty()==false && st.peek().chr == ch )
            {
                 st.peek().freq++;
 
                 if( st.peek().freq == k )
                 {
                     st.pop();
                 }
            }
            else
            {
                Pair p = new Pair( ch, 1);
 
                st.push( p );
            }
        }
 
 
        StringBuilder ans= new StringBuilder();
 
        while( st.isEmpty()==false)
        {
            int freq= st.peek().freq;
            char ch = st.peek().chr;
            st.pop();
 
            for( int i=1;i<= freq;i++)
            {
                 ans.append( ch );
            }
        }
 
        ans.reverse();
        return ans.toString();
    }
}

Q. Remove k digits

class Solution {
    public String removeKdigits(String nums, int k) 
    {
 
         Stack<Character> st= new Stack<>();
 
         for( int i=0;i< nums.length();i++)
         {
              char ch = nums.charAt(i);
 
              while( st.isEmpty()==false && st.peek()> ch  && k>0)
              {
                   st.pop();
                   k--;
              }
 
              st.push(ch);
         }
 
         while( st.isEmpty()==false  && k>0)
         {
              st.pop();
              k--;
         }
 
         StringBuilder ans= new StringBuilder();
 
         while( st.isEmpty()==false)
         {
              char ch = st.pop();
 
              ans.append( ch );
         }
 
         ans.reverse();
 
         int i=0;
 
         while( i< ans.length() && ans.charAt(i)=='0')
         {
              i++;
         }
 
         if( i== ans.length() )
         {
             return "0";
         }
        else
        {
             return ans.toString().substring(i);
        }
 
    }
}