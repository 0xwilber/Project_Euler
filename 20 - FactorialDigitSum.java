package Project_Euler;

import java.math.BigInteger;

public class FactorialDigitSum 
{   
    public static void main(String[] args)
    {
        BigInteger bi = BigInteger.valueOf(1);
       for (int i=1; i<=100; i++)
       {
           bi = bi.multiply(BigInteger.valueOf(i));
       }
       
       String s = bi.toString();
       String[] split = s.split("(?!^)");
       int ans=0;
       for (String x:split)
       {
           int a = Integer.parseInt(x);
           ans+=a;
       }
       System.out.println(ans);
    }
}