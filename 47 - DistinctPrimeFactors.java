package Project_Euler;

public class DistinctPrimeFactors {

    public static void main(String[] args) {
        String s = "";
        for (int i = 130000; i < 150000; i++) {
            if (hasPrimeFactor(i) && hasPrimeFactor(i+1)&& hasPrimeFactor(i+2)) {
                System.out.println(i);
            }
        }/*
        String[] d = s.split(",");
        int[] x = new int[d.length];
        for (int a = 0; a < x.length; a++) {
            x[a] = Integer.parseInt(d[a]);
        }
        for (int j = 0; j < x.length - 4; j++) {
            if ((x[j] + 1 == x[j + 1]) && (x[j] + 2 == x[j + 2]) && (x[j] + 3 == x[j + 3])) {
                System.out.println(x[j] + "," + x[j + 1] + "," + x[j + 2] + "," + x[j + 3]);
                break;
            }
        }*/
    }

    private static boolean hasPrimeFactor(int n) {
        /**
         * Get all prime factors of n and brute force a solution where n = the
         * product of 4 prime factors
         */
        String s = "";
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    s += String.valueOf(i) + ",";
                }
            }
        }
        if (!s.equals("")) {
            String[] d = s.split(",");
            int[] x = new int[d.length];
            for (int a = 0; a < x.length; a++) {
                x[a] = Integer.parseInt(d[a]);
            }

            for (int j = 0; j < x.length; j++) {
                for (int k = 0; k < x.length; k++) {
                    for (int l = 0; l < x.length; l++) {
                        for (int m = 0; m < x.length; m++) {
                            if (distinct(j, k, l, m)) {
                                if ((x[j] * x[k] * x[l] * x[m]) == n) {
                                    //System.out.println(x[j] + "," + x[k] + "," + x[l] + "," + x[m]);
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean distinct(int j, int k, int l, int m) {
        int[] d = {j, k, l, m};
        for (int i = 0; i < 4; i++) {
            for (int h = 0; h < 4; h++) {
                if (d[i] == d[h] && i != h) {
                    return false;
                }
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
