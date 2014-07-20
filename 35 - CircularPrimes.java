package Project_Euler;

public class CircularPrimes {

    public static void main(String[] args) {
        int primeCount = 0;
        for (int i = 2; i < 1000000; i++) {
            if (isPrime(i)) {
                String n = String.valueOf(i);
                if (n.length() == 1) {
                    primeCount++;
                } else {
                    if (rotate(i)) {
                        primeCount++;
                    }
                }
            }
        }
        System.out.println("There are " + primeCount + " circular primes.");
    }

    private static boolean rotate(int n) {
        int start = n;

        int numdigits = (int) Math.log10((double) n); // would return numdigits - 1

        int multiplier = (int) Math.pow(10.0, (double) numdigits);

        while (true) {
            int q = n / 10;
            int r = n % 10;
            //1234 = 123;
            n = n / 10;
            n = n + multiplier * r;
            if (!isPrime(n)) {
                return false;
            }
            if (n == start) {
                break;
            }
        }
        return true;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
