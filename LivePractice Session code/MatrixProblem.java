import java.util.*;
public class MatrixProblem
{
    static int[][] transpose(int [][] matrix)
    {
        int n = matrix.length;

        int curr_r = 0;
        int curr_c = 0;

        while(curr_r < n)
        {
            int i = curr_r;
            for(int j=curr_c; j<n; j++)
            {
                //swap row, col wit
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

            curr_r ++;
            curr_c ++;

        }

        return matrix;
    }

    public static void printSpiral(int[][] matrix)
    {
        int n = matrix.length;
        int m =matrix[0].length;

        int sr = 0, sc =0, er = n-1, ec = m-1;
        int row,col;

        while(sr <= er && sc <= ec)
        {
            //print starting col from sr to er
            col = sc;
            for(row = sr ; row <= er && sc <= ec ; row++)
            {
                System.out.print(matrix[row][col]+",");
            }
            sc++;
            //print ending row from sc to ec
            row = er;
            for(col = sc; col <= ec && sr <= er; col++)
            {
                System.out.print(matrix[row][col]+",");
            }
            er--;
            //print starting row from ec to sc
            row = sr;
            for(col = ec ; col >= sc && sr <= er && sc <= ec; col--)
            {
                System.out.print(matrix[row][col]+",");
            }
            sr++;
            System.out.println();
        }
    }

    public static Complex add(Complex a, Complex b)
    {
        return new Complex((a.real+b.real),(a.imag+b.imag));
    }

    public static Complex product(Complex a, Complex b)
    {
        return new Complex(((a.real*b.real)-(a.imag*b.imag)), ((a.real*b.imag)+(a.imag*b.real)));
    }

    public void printComplex()
    {
        if(real == 0 && imag != 0)
        {
            System.out.println(imag+"i");
        }
        else if(imag == 0 && real != 0)
        {
            System.out.println(real);
        }
        else
        {
            System.out.println(real+"+"+imag+"i");
        }
    }

     public static void main ( String args[]) 
{
     Complex c = new Complex(4,5);
     Complex d = new Complex(9,4);
     Complex e = Complex.add(c,d);
     e.printComplex();
} 
 } 