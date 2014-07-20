package Project_Euler;

public class LongestCollatz
{
    
    public static void main(String[] args)
    {  
        String a="";
        long count=1;
        
        for (int i=1; i<1000000; i++)
        {
            long newCount=1;
            long j=i;
            while (getNextNum(j)!=1)
            {
                newCount++;
                if (newCount>count)
                {
                    count++;
                    a = "Highest chain comes from " + i + ", and has " + (count + 1) + " terms";
                }
                j=getNextNum(j);
            }
            
        }
        System.out.println(a);
    }
    
    private static long getNextNum(long i)
    {
        if (i%2==0)
                return even(i);
            else
                return odd(i);
    }
    private static long even(long n)
    {
        return (n/2);
    }
    private static long odd(long n)
    {
        return (3*n)+1;
    }
}