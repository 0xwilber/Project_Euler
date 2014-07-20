package Project_Euler;

import java.math.BigInteger;

public class DoubleBasePalindromes {

    public static void main(String[] args) {
        int sum = 0;
        for (long i = 1; i < 590000; i++) {
            //System.out.println(binary + ", " + i);
            String b = toBinary(i).toString();
            if (isPal(BigInteger.valueOf(i)) && isPal(toBinary(i))) {
                sum += i;
            }
        }
        //sum++;
        System.out.println("Sum of numbers is " + sum);
    }

    private static BigInteger toBinary(long n) {
        String ans = "";//positions of 1's - zero based
        while (n > 0) {
            int i = 0, p = 0;
            while (Math.pow(2, i) <= n) {
                p = i;
                i++;
            }
            ans += p + ":";
            n = n - (int) Math.pow(2, p);
        }
        String[] digits = ans.split(":");
        int binLen = (Integer.parseInt(digits[0])) + 1;
        int[] bin = new int[binLen];
        for (int a : bin) {//fill with zeros rather than null
            a = 0;
        }
        for (String digit : digits) {
            for (int y = 0; y < binLen; y++) {
                int c = Integer.parseInt(digit);
                if (c == y) {
                    bin[c] = 1;
                }
            }
        }
        String finalx = "";
        for (int d = bin.length - 1; d >= 0; d--) {
            finalx += String.valueOf(bin[d]);
        }
        BigInteger b = new BigInteger(finalx);
        return b;
    }

    private static boolean isPal(BigInteger n) {
        String s = String.valueOf(n);
        int len = s.length();
        int middle = (int) Math.floor(len / 2);
        String left = "", right = "";
        char[] digits = s.toCharArray();
        for (int i = 0; i < len; i++) {
            if (i < middle) {
                left += String.valueOf(digits[i]);
            } else if (len % 2 == 0) {
                right += String.valueOf(digits[i]);
            } else if (i > middle) {
                right += String.valueOf(digits[i]);
            }
        }
        String righty = "";
        for (int i = right.length() - 1; i >= 0; i--) {
            righty += right.toCharArray()[i];
        }
        if (left.equals(righty)) {
            return true;
        } else {
            return false;
        }
    }
}
