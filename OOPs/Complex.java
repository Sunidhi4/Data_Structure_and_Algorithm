import java.util.*;
 
 class Complex{
    int real;
    int image;
    public Complex(int r, int i)
    {
        real = r;
        image = i;
    }

   public static Complex add( Complex a, Complex b)
    {
           return new Complex((a.real+b.real),(a.image+b.image));
    }

    public static Complex diff(Complex a, Complex b)
    {
        return new Complex((a.real+b.real),(a.image+b.image));
    }
    
    public static Complex product(Complex a, Complex b)
    {
        return new Complex(((a.real*b.real)-(a.image*b.image)), ((a.real*b.image)+(a.image+b.real)));
    }

    public void  printComplex()
    {
        if(real == 0 && image !=0)
        {
            System.out.println(image+"i");
        }
        else if(image == 0 && real != 0)
        {
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+image+"i");
        }
    }

    public static void main(String[] args)
    {
        Complex c = new Complex(4,5);
        Complex d = new Complex(9,4);
       Complex e = Complex.add(c,d);
       Complex f = Complex.diff(c,d);
       Complex g = Complex.product(c,d);
       e.printComplex();
       f.printComplex();
       g.printComplex();
    }
 }
