package Project_Euler;

import java.math.BigInteger;
import java.util.ArrayList;

public class DistinctPowers{

    public static void main(String[] args)
    {
        ArrayList set = new ArrayList();

        for (int a=2; a<=100; a++)
        {
            for (int b=2; b<=100; b++)
            {
                BigInteger num = BigInteger.valueOf(a);
                num = num.pow(b);
                if (!set.contains(num))
                    set.add(num);
            }
        }
        
        int num = set.size();
        System.out.println(num);
        
    }
}