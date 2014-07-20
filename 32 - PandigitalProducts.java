package Project_Euler;

import java.util.ArrayList;
import java.util.List;

public class PandigitalProducts {

    public static void main(String[] args) {
        List prod = new ArrayList();
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 10000; j++) {
                if (isValid(i, j)) {//has 9 digits and contains 1-9
                    int prodt = i * j;
                    if (!prod.contains(prodt)) {//product hasnt already been calculated
                        prod.add(prodt);
                    }
                }
            }//inner for
        }//outer for
        int sum = 0;
        for (Object o : prod) {
            sum += (int) o;
        }
        System.out.println("Sum of products is " + sum);
    }//main

    private static boolean isValid(int a, int b) {
        int i = String.valueOf(a).length();
        int j = String.valueOf(b).length();
        int k = String.valueOf(a * b).length();
        if ((i + j + k) != 9) {
            return false;
        } else {
            return (hasDigits(a, b));
        }
    }

    private static boolean hasDigits(int a, int b) {
        String all = String.valueOf(a) + String.valueOf(b) + String.valueOf(a * b);
        char[] nums = all.toCharArray();
        for (int i = 0; i < nums.length; i++) {
            /*
             If it contains repeats, we can safely assume
             that it doesnt have 1-9 since we already checked
             it was 9 digits long
             */
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == (nums[j]) && i != j) {
                    return false;
                }
                if (nums[j] == '0') {
                    return false;
                }
            }
        }
        return true;
    }
}
