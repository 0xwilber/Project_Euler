package Project_Euler;

import java.math.BigInteger;

public class SelfPowers {

    public static void main(String[] args) {
        
        BigInteger sum = new BigInteger("0");
        for (int i=1; i<=1000; i++)
        {
            BigInteger bi = BigInteger.valueOf(i);
            bi = bi.pow(i);
            sum = sum.add(bi);
        }
        
        String numStr = sum.toString();
        String s = numStr.substring(numStr.length()-10, numStr.length());
        System.out.println(s);
    }

}