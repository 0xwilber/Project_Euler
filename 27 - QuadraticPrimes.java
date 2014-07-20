package Project_Euler;

public class QuadraticPrimes
{
    public static void main(String[] args)
    {
        int maxPrimes=0, c1=0,c2=0;
        
        for (int a=-1000; a<1000; a++)
        {
            for (int b=-1000; b<1000; b++)
            {
                int i=0;
                while (isPrime(Math.abs((i*i)+(a*i)+b)))
                {
                    i++; 
                }

                if (i > maxPrimes) //store largest num primes
                {
                    c1=a;
                    c2=b;
                    maxPrimes = i;
                }
            } //b
        } //a
        
        System.out.println("Product of coefficients " + (c1) + " and " + c2 + " is "
                + (c1*c2) + " which produce " + maxPrimes + " consecutive prime numbers");
    }
    
    private static boolean isPrime(int n)
    {
        if (n%2==0) return n==2;
        if (n%3==0) return n==3;
        int step=4, m=(int)Math.sqrt(n)+1;
        for (int i=5; i<m; step=6-step, i+=step)
        {
            if (n%i==0) return false;
        }
        return true;
    }
}