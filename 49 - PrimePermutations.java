package Project_Euler;

public class PrimePermutations {

    public static void main(String[] args) {

        for (int i = 1488; i < 10000; i++) {
            for (int j = 1; j < 6000; j++) {
                if (isPrime(i) && isPerm(i, j) && isPerm(i, (2 * j))) {
                    System.out.println(i + "" + (i + j) + "" + (i + (2 * j)));
                    break;
                }
            }
        }
    }

    private static boolean isPerm(int i, int j) {
        if (String.valueOf(i + j).length() != 4) {
            return false;
        }
        int d = sort(i);
        int d1 = sort(i + j);
        return ((sort(i) == sort(i + j)) && isPrime(i + j));
    }

    private static int sort(int n) {
        int[] temp = new int[4];

        for (int i = 3; i >= 0; i--) {
            temp[i] = n % 10;
            n /= 10;
        }
        int old;
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < 3; i++) {
                if (temp[i] > temp[i + 1]) {
                    old = temp[i];
                    temp[i] = temp[i + 1];
                    temp[i + 1] = old;
                    changed = true;
                }
            }
        }
        String s = "";
        for (int i = 0; i < 4; i++) {
            s += temp[i];
        }
        return Integer.parseInt(s);
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
