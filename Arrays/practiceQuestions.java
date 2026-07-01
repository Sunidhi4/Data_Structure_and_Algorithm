public class practiceQuestions
{
    public static int counts(int matrix[][], int key)
    {
        int count = 0;
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j] == key)
                {
                    count++;
                }
            }
        }
        return count;

    }
    public static int sumOfSecondRow(int matrix[][])
    {
        int sum = 0;
        for(int j=0; j<matrix[0].length; j++)
        {
            sum += matrix[1][j];
        }
        return sum;
    }
    public static void transposeOfMatrix(int matrix[][])
    {
        int m = matrix.length;
        int n = matrix[0].length;
        int newMatrix [][] = new int [n][m];
        for(int i=0; i<newMatrix.length; i++)
        {
            for(int j=0; j<newMatrix[0].length; j++)
            {
                newMatrix[i][j] = matrix[j][i];
            }
        }
        for(int i=0; i<newMatrix.length; i++)
        {
            for(int j=0; j<newMatrix[0].length; j++)
            {
                System.out.print(newMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
     public static void main ( String args[]) 
{
     int matrix01 [][] = {{4, 3, 7, 1},
                         {2, 5, 7, 1}};
    System.out.println("count of 7 is : "+counts(matrix01 , 7));
    int matrix02 [][] = {{1, 4, 9},
                         {11, 4, 3},
                         {2, 2, 3}};
    System.out.println("sum of second row : "+sumOfSecondRow(matrix02));

    int matrix03 [][] = {{1, 4, 3},
                         {5, 6 ,8}};
     transposeOfMatrix(matrix03);
} 
 } 