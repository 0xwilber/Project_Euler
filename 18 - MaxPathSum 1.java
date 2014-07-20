package Project_Euler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MaxPathSum
{

    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\l33tdawg.l33tdawg-PC\\Documents\\triangle.txt"));

        String line=in.readLine(); //75
        int[][] nums = new int[100][100];
        int row=0,column=0;

        while (line!=null)
        {
            column=0;
            String[] split = line.split(" ");
            if (line.length()>0)
            {
                for (String x:split)
                {
                    nums[row][column] = Integer.parseInt(x);
                    column++;
                }

                row++;
            }
            line = in.readLine();
        }
        
        for (int i=(row-2); i>=0; i--) //rows
        {
            for (int j=0; j<=i; j++) //columns
                nums[i][j] += Math.max(nums[i+1][j],nums[i+1][j+1]); //previous row, two consecutive values
            
        }
        System.out.println(nums[0][0]);
    }
}