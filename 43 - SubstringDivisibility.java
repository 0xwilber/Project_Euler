package Project_Euler;

public class SubstringDivisibility {

    public static void main(String[] args) {
        long sum = 0;
        for (long i = 1023456789; i <= 9876543210L; i++) {
            if (isPan(i) && hasProperty(i)) {
                sum += i;
            }
        }
        System.out.println("Sum of pandigital numbers is " + sum);
    }

    private static boolean isPan(long l) {
        char[] d = String.valueOf(l).toCharArray();
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {                                                                                                        
                if (d[i] == d[j] && i != j) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean hasProperty(long l) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17};
        for (int i = 0; i < 7; i++) {
            String sub = String.valueOf(l).substring(i + 1, i + 4);
            if (Integer.parseInt(sub) % primes[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
