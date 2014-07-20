package Project_Euler;

public class ChampernownesConstant {

    public static void main(String[] args) {
        int prod = 1, count = 0, digit = 100;
        for (int i = 1; i < 200000; i++) {
            count += String.valueOf(i).length();
            if (count >= digit) {
                int ans;
                int ahead = count - digit;
                char[] values = String.valueOf(i).toCharArray();
                int len = String.valueOf(i).length();
                ans = Integer.parseInt(String.valueOf(values[len - ahead - 1]));
                prod *= ans;
                if (count <= 1000000) {
                    digit *= 10;
                } else {
                    break;
                }
            }
        }
        System.out.println("The total is " + prod);
    }
}