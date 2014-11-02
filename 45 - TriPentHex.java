package Project_Euler;

public class TriPentHex {

    public static void main(String[] args) {
        for (long i = 1500000000; i <= 5000000000L; i++) {
            if (tri(i) && pent(i) && hex(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    private static boolean tri(long n) {
        double x = (Math.sqrt((8 * n) + 1) - 1) / 2;
        double r = x % 1;
        if (r == 0.0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean pent(long n) {
        double x = (Math.sqrt((24 * n) + 1) + 1) / 6;
        double r = x % 1;
        if (r == 0.0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean hex(long n) {
        double x = (Math.sqrt((8 * n) + 1) + 1) / 4;
        double r = x % 1;
        if (r == 0.0) {
            return true;
        } else {
            return false;
        }
    }
}
