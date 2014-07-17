/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Project_Euler;
public class AmicableNumbers {

    public static void main(String[] args) 
    {
        int ans=0;
        for (int i=1; i<10000; i++)
        {
            int n = sumOfDivisors(sumOfDivisors(i));
            if(n==i && sumOfDivisors(i)!=i)
                ans+=(n + i);
        }
        System.out.println(ans/2);
    }
    
    private static int sumOfDivisors(int n)
    {
        int ans=0;
        for (int i=1; i<n; i++)
        {
            if (n%i==0)
                ans+=i;
        }
        return ans;
            
    }

}