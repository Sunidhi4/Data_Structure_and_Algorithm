public class InterfacesDemo
{
     public static void main ( String args[]) 
{
     Queen q = new Queen();
     q.move();
} 
 } 
 interface ChessPlayer
 {
    void move();
 }
 class Queen implements ChessPlayer
 {
    public void move()
    {
        System.out.println("up, down, left, right, diagonals(in all directions)");
    }
 }
 class Rook implements ChessPlayer
 {
    public void move()
    {
        System.out.println("up, down, left and right");
    }
 }
 class King implements ChessPlayer
 {
    public void move()
    {
        System.out.println("up, down, left, right, diagonals(in all directions) by one step ");
    }
 }