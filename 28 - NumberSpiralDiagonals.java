package Project_Euler;

public class NumberSpiralDiagonals {

    public static void main(String[] args) {
        int br, bl, tl, tr = 1, sum = 0;

        for (int i = 1; i <= 500; i++) {
            br = (2 * i) + tr;
            bl = br + (2 * i);
            tl = bl + (2 * i);
            tr = tl + (2 * i);

            sum += (br + bl + tr + tl);
        }
        System.out.println(sum + 1);
    }
}