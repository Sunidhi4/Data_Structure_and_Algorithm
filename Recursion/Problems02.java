public class Problems02
{
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[])
    {
        if(idx == str.length())
        {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);if(map[currChar-'a'] == true)
        {
            removeDuplicates(str, idx+1, newStr, map);
        }
        else
        {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int friendsPairingProblem(int n)
    {
        if(n == 1 || n == 2)
        {
            return n;
        }
        int fnm1 = friendsPairingProblem(n-1);
        int fnm2 = friendsPairingProblem(n-2);
        int pairWays = (n-1)*fnm2;
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }

    public static  void printBinaryString(int n , int lastPlace, String str)
    {
        if(n == 0)
        {
            System.out.println(str);
            return;
        }
        printBinaryString(n-1, 0, str+"0");
        if(lastPlace == 0)
        {
            printBinaryString(n-1, 1, str+"1");
        }
    }
     public static void main ( String args[]) 
{
     String str ="appnnacollege";
     removeDuplicates(str, 0, new StringBuilder(""),new boolean[26]);
     System.out.println(friendsPairingProblem(3));
     printBinaryString(3, 0, "");
} 
 } 