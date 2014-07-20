package Project_Euler;

public class PandigitalMultiples {

    public static void main(String[] args) {
        String prod;
        int max = 0;
        for (int i = 1; i <= 10000; i++) {
            prod = "";
            for (int j = 1; j <= 20; j++) {
                prod += String.valueOf(i * j);
                if (prod.length() == 9) {
                    int p = Integer.parseInt(prod);
                    if (isPan(p)) {
                        if (p > max) {
                            max = p;
                        }
                    }
                }
            }

        }
        System.out.println("Largest pandigital number is " + max);
    }

    private static boolean isPan(int n) {
        char[] d = String.valueOf(n).toCharArray();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (d[i] == d[j] && i != j || d[j] == '0') {
                    return false;
                }
            }
        }
        return true;
    }
}
