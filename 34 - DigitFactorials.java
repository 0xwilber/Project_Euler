package Project_Euler;
public class DigitFactorials 
{

    public static void main(String[] args) 
    {
        int ans=0;
        for (int i=145; i<=1000000; i++)
        {
            int[] digits = splitNum(i);
            if (sumFactorials(digits)==i)
                ans+=i;
        }
        System.out.println(ans);
    }
    
    private static int[] splitNum(int n)
    {
        int[] num = {n};
        if (n<10)
            return num;
        else
        {
            int[] split = new int[(""+n).length()];
            int i=0;
            while (n>0)
            {
                split[i] = (n%10);
                i++;
                n=n/10;
            }
            return split;
        }
    }
    
    private static int sumFactorials(int[] n)
    {
        int ans=0;
        for (int x:n)
        {
            ans+=factorial(x);
        }
        return ans;
    }
    private static int factorial(int n)
    {
        int ans=1;
        
        for (int i=n; i>0; i--)
        {
            ans*=i;
        }
        
        return ans;
    }

}