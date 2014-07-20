package Project_Euler;

public class TruncatablePrimes {

    public static void main(String[] args) {
        int sum = 0, count = 0;
        for (int i = 10; i < 1000000; i++) {
            if (isPrime(i) && trimRL(i) && trimLR(i)) {
                count++;
                sum += i;
            }
        }
        System.out.println("Sum of " + count + " truncatable primes is " + sum);
    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean trimLR(int n) {
        int len = String.valueOf(n).length();
        char[] d = String.valueOf(n).toCharArray();
        String num = "";
        int x = 0, check;
        while (x < len - 1) {
            x++;
            for (int i = x; i < len; i++) {
                num += String.valueOf(d[i]);
            }
            check = Integer.parseInt(num);
            if (!isPrime(check)) {
                return false;
            }
            num = "";

        }
        return true;
    }

    private static boolean trimRL(int n) {
        int len = String.valueOf(n).length();
        for (int i = 1; i < len; i++) {
            n = n / 10;
            if (!isPrime(n)) {
                return false;
            }
        }
        return true;
    }
}
