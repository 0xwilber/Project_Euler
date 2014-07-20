package Project_Euler;

public class DivisibleTriangularNumber{
    
    public static void main(String[] args)
    {
        int triNum=0;
        int count=0;
        int i=1;
        while (count<500)
        {
            count=0;
            triNum+=i;  
            i++;
            int sqrt = (int)Math.sqrt(triNum);
            for (int j=1; j<=sqrt; j++)
            {
                if (triNum%j==0)
                {
                    count+=2; //number of divisors
                }
            }
        }
        System.out.println("First triangle number with > 500 divisors is: "+triNum);
    }
    

}