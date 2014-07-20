package Project_Euler;

public class DigitCancelingFractions {

    public static void main(String[] args) {
        String ans = "";
        int top = 1, bottom = 1;
        for (double i = 10; i < 100; i++) {
            for (double j = 10; j < 100; j++) {

                if (i < j && isValid(i, j)) {
                    ans += (i + ":" + j + "\n");
                    top *= i;
                    bottom *= j;
                }

            }
        }

        int max = 0;
        for (int a = 1; a <= top; a++) {
            if (bottom % a == 0) {
                max = a;
            }
        }
        System.out.println(ans + "\n" + top / max + " / " + bottom / max + "\n" + max);
    }

    private static boolean isValid(double i, double j) {
        char[] nums = (String.valueOf((int) i) + String.valueOf((int) j)).toCharArray();

        if ((nums[0] != nums[1]) && (nums[2] != nums[3]) && (nums[1] != '0') && (nums[3] != '0') && (nums[1] != nums[3])) {
            for (int x = 0; x < nums.length; x++) {
                for (int y = 0; y < nums.length; y++) {
                    if (nums[x] == nums[y] && x != y) {
                        double div = i / j;
                        int index1 = x, index2 = y;
                        if (x == 1) {
                            index1 = 0;
                        }
                        if (y == 2) {
                            index2 = 3;
                        }
                        double small = Double.parseDouble(String.valueOf(nums[index1])) / Double.parseDouble(String.valueOf(nums[index2]));
                        if (div == small) {
                            return true;
                        }
                        break;
                    }
                }
            }
        }
        return false;
    }
}
