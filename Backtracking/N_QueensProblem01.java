public class N_QueensProblem01
{
    public static boolean isSafe(char  board[][], int row, int col)   // timecomplexity : O(n!)
    {
        //for straight upward
        for(int i=row-1;i>=0; i-- )
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }
        //for diagonal upwards

        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }

        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--, j++)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }

        return true;
    }
    // public static void nQueens(char board[][], int i)  //this is for all solution will print.
    // {
    //     if(i == board.length)
    //     {
    //         printArr(board);
    //         count++;
    //         return;
    //     }

    //     for(int j=0; j<board.length; j++)
    //     {
    //         if(isSafe(board, i, j))
    //         {
    //             board[i][j] = 'Q';
    //             nQueens(board, i+1);
    //             board[i][j] = 'X';
    //         }
    //     }
    // }

    public static boolean nQueens(char board[][], int i) //this is for only  one solution print
    {
        if(i == board.length)
        {
            // printArr(board);
            count++;
            return true;
        }

        for(int j=0; j<board.length; j++)
        {
            if(isSafe(board, i, j))
            {
                board[i][j] = 'Q';
               if( nQueens(board, i+1))
               {
                return true;
               }
                board[i][j] = 'X';
            }
        }
        return false;
    }
    public static void printArr(char board[][])
    {
        System.out.println("-------------new board ---------------");
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static  int count =0;
     public static void main ( String args[]) 
{
     int n = 2;
     char board[][] = new char [n][n];
     for(int i=0; i<board.length; i++)
     {
        for(int j=0; j<board.length; j++)
        {
            board[i][j] = 'X';
        }
     }
     if(nQueens(board, 0)){
        System.out.println("solution is possible");
        printArr(board);
     }
     else{
        System.out.print("solution is not possible");
     }
     System.out.println("total number of ways to solve n Queen problem is : "+count);
} 
 } 