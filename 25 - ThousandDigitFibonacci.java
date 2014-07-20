package Project_Euler;

import java.math.BigInteger;

public class ThousandDigitFibonacci
{
    public static void main(String[] args)
    {
        BigInteger temp = new BigInteger("0");
        BigInteger f1 = new BigInteger("1");
        BigInteger f2 = new BigInteger("1");
        int term=2;
        
        while ((""+f2.toString()).length()!=1000)
        {
            temp=f2; //old val
            f2 = f2.add(f1);
            f1=temp;
            term++;
        }
        System.out.println("First term to contain 1000 digits is "+f2+" at position "+term);
    }
}