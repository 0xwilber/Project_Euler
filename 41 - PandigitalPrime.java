package Project_Euler;

public class PandigitalPrime {

    public static void main(String[] args) {
        int n = 1000000000;
        boolean[] isPrime = new boolean[n];
        for (int j = 2; j < n; j++) {
            isPrime[j] = true;
        }
        for (int k = 2; k * k < n; k++) {

            // if i is prime, then mark multiples of i as nonprime
            // suffices to consider mutiples i, i+1, ..., N/i
            if (isPrime[k]) {
                for (int l = k; k * l < n; l++) {
                    isPrime[k * l] = false;
                }
            }
        }

        int max = 0;
        for (int i = 1000000; i < 10000000; i++) {
            if (isPan(i)) {
                if (isPrime[i]) {
                    if (i > max) {
                        max = i;
                    }
                }
            }
        }
        System.out.println("Largest pan prime is " + max);
    }

    private static boolean isPan(int n) {
        int len = String.valueOf(n).length();
        char[] d = String.valueOf(n).toCharArray();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (d[i] == d[j] && i != j || d[j] == '0' || Integer.parseInt(String.valueOf(d[j])) > len) {
                    return false;
                }
            }
        }
        return true;
    }
}
