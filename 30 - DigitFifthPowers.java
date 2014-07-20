package Project_Euler;

public class DigitFifthPowers{

    public static void main(String[] args)
    {
        int[] digits = new int[7];
        int[] numbers = new int[20];
        int count=-1;
        for (int i=100; i<=1000000; i++)
        {
            int temp = i,index=(""+i).length();
            while(temp>0)
            {
                index--;
                digits[index] = (temp%10);
                temp=temp/10;
            }
            int sum=0;
            for (int x:digits)
            {
                sum+=(int)Math.pow(x,5);
            }
            if (sum==i)
            {
                count++;
                numbers[count]=i;
            }
                
                
        } //for loop
        int ans=0;
        for (int a:numbers)
            ans+=a;
        System.out.println("Sum is: "+ans);
        
    }
}