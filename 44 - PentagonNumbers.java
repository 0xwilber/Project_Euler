package Project_Euler;

public class PentagonNumbers {

    public static void main(String[] args) {
        int add, diff, min = 1000000000;
        for (int i = 10; i <= 10000; i++) {
            for (int j = 10; j <= 10000; j++) {
                if (i != j) {
                    add = pent(i) + pent(j);
                    diff = Math.abs(pent(i) - pent(j));
                    if (isPent(add) && isPent(diff)) {
                        if (diff < min) {
                            min = diff;
                        }
                    }
                }
            }
        }
        System.out.println("Smallest difference is " + min);
    }

    private static int pent(int n) {
        return ((3 * (n * n)) - n) / 2;
    }

    private static boolean isPent(int n) {
        double x = ((Math.sqrt((24 * n) + 1)) + 1) / 6; //(sqrt(24n+1)+1)/6
        if (x % 1 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
