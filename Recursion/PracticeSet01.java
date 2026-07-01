public class PracticeSet01
{
     public static void occurence(int arr[], int key, int n)
     {
          if(n<0)
          {
               return ;
          }
          occurence(arr, key, n-1);
          if(arr[n] == key)
          {
               System.out.print(n+" ");
          }
     }

     public static void numberToString(int num)
     {
         String [] ch = {"zero", "one", "two", "three", "four", "five", "six","seven", "eight", "nine"};
          // String  w;

          if(num == 0)
          {
               return;
          }
          int lastDigit = num%10;
          numberToString(num/10);
     //     if(num.charAt(n) == '0')  w = "zero";
     //      else if(num.charAt(n) == '1')  w = "one";
     //      else if(num.charAt(n) == '2') w= "two";
     //      else if(num.charAt(n) == '3')  w = "three";
     //      else if(num.charAt(n) == '4')  w = "four";
     //      else if(num.charAt(n) == '5')  w = "five";
     //      else if(num.charAt(n) == '6') w = "six";
     //      else if(num.charAt(n) == '7')  w = "seven";
     //      else if(num.charAt(n) == '8') w= "eight";
     //      else  w= "nine";
             
          System.out.print(ch[lastDigit]+" ");
     }

     public static int lengthOfString(String s)
     {
         if(s.length() == 0)
         {
          return 0; 
         }
         return lengthOfString(s.substring(1))+1;

     }

     public static int contiguousSubString(String s, int si, int ei)
     {
          if(si>ei)
          {
               return 0;
          }

         int forLeft = contiguousSubString(s, si+1, ei);
         int forRight = contiguousSubString(s, si, ei-1);
         int forCenter = contiguousSubString(s, si+1, ei-1);

         int ans = forLeft + forRight - forCenter;

         if(s.charAt(si) == s.charAt(ei))
         {
          ans++;
         }

         return ans;
     }

     public static void toh(int n, int A, int C, int B)
     {
          if(n == 0)
          {
               return;
          }
          toh(n-1,A,B,C);
          System.out.println("we move disk "+n+"  from "+A+" to "+C);
          toh(n-1, B, C, A);
     }
     public static void main ( String args[]) 
{
     int arr[] = {3,2,4,5,6,2,7,2,2};
     int key = 2;
     int n = arr.length-1;
     occurence(arr, key, n);
     System.out.println();
     int num = 2014;
     // int n1 = num.length()-1;
     numberToString(num);
     System.out.println();
     int len = lengthOfString("hello");
     System.out.println(len);
     String s1 = "abcab";
     System.out.println(contiguousSubString(s1,0,s1.length()-1 ));
     toh(3,10,20,30);
} 
 } 