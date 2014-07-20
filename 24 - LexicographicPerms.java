/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Project_Euler;
public class LexicographicPerms {

    public static void main(String[] args) {
        int[] n = {0,1,2,3,4,5,6,7,8,9};
        int k=0,l=0,temp,count=1,num=1000000;
        
        while (count<num)
        {
            for (int i=0; i<n.length-1; i++)
            {
                if (n[i]<n[i+1])
                    k=i;
            }
            for (int j=0; j<n.length; j++)
            {
                if (n[j]>n[k])
                    l=j;
            }

            temp = n[l];
            n[l] = n[k];
            n[k] = temp;

            if (n[k+1]!=n[n.length-1])
            {
                int[] reversed = new int[n.length-(k+1)];
                for (int a=(k+1); a<n.length; a++)
                {
                    reversed[n.length-a-1] = n[a];
                }
                int b=k+1;
                for (int y:reversed)
                {
                    n[b] = y;
                    b++;
                }
                
            }
            count++;
        }
        for(int x:n)
            System.out.print(x);
        System.out.println();
    }

}