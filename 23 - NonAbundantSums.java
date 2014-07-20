package Project_Euler;

public class NonAbundantSums {

    public static void main(String[] args) 
    {
        //find abundant numbers
        int[] abundantNums = new int[6965];
        int index=-1,limit=28123;
        for (int i=1; i<=28123; i++)
        {
            if (abundant(i))
            {
                index++;
                abundantNums[index] = i;
            }
        }
        
        //mark which numbers are sum of abundant nums
        boolean[] sumOfAbundant = new boolean[limit+1];
        
        for (int a=0; a<abundantNums.length; a++)
        {
            for (int b=a; b<abundantNums.length; b++)
            {
                if (abundantNums[a]+abundantNums[b] <= 28123)
                    sumOfAbundant[abundantNums[a]+abundantNums[b]]=true;
                else
                    break;
                    
            }
        }
        
        //all other values in bool array will be false. Just add these up
        int ans=0;
        for (int c=1; c<=limit; c++)
        {
            if (!sumOfAbundant[c])
                ans+=c;
        }
        System.out.println(ans);
    }

    private static boolean abundant(int n)
    {
        int sumDiv=0,i=1;
        while(i<n)
        {
            if (n%i==0)
                sumDiv+=i;
            i++;
        }
        if (sumDiv <= n)
            return false;
        else
            return true;
    }
}