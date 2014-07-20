/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Project_Euler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LargestProductInAGrid 
{
    static int[][] grid = new int[20][20];
    static int maxProd=0;
    static int s = 0, t=0;
    
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        load();
        horizontal();
        System.out.println(maxProd + " " + s+" "+t);
    }
    static void load() throws FileNotFoundException, IOException
    {
        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\l33tdawg.l33tdawg-pc\\Documents\\grid.txt"));

        String line = in.readLine();
        int row=0,column=0;
        while (line != null)
        {
            String[] split = line.split(" ");
            column=0;
            for (String num:split)
            {
                grid[row][column] = Integer.parseInt(num);
                column++;
            }
            row++;
            line = in.readLine();
        }//while
    }
    static void horizontal()
    {
        int prod=1, c=0;
        
        for (int j=0; j<20; j++)
        {
            c=0;
            while (c <= 16)
            {
                prod=1;
                for (int i=0; i <= 3; i++)
                {
                    prod *= grid[j][c+i];
                }
                c++;
                if (prod > maxProd)
                {
                    maxProd = prod;
                    s = c;
                    t=j;
                }
            }
        }
    }
}