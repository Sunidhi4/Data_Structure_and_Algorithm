public class ShortestPath
{
    public static float Shortest(String word)
    {
        int x = 0, y = 0;
        int i = 0;
        while(i<word.length())
        {
            if(word.charAt(i) == 'N')
            {
                y++;
            }
            else if(word.charAt(i) == 'S')
            {
                y--;
            }
            else if(word.charAt(i) == 'E')
            {
                  x++;
            }
            else{
                x--;
            }
            i++;
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
     public static void main ( String args[]) 
{
     String word = "WNEENESENNN";
    System.out.println(Shortest(word));
} 
 } 