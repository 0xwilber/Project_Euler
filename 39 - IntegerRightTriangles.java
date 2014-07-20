package Project_Euler;

public class IntegerRightTriangles {

    public static void main(String[] args) {
        int perimeter = 120, sol = 0, max = 0, pmax = 0;
        while (perimeter <= 1000) {
            for (int a = 1; a <= 500; a++) {
                for (int b = 1; b <= 500; b++) {
                    double c = Math.sqrt((a * a) + (b * b));
                    if ((a + b + c) == perimeter) {
                        sol++;
                    }
                }
            }
            if ((sol / 2) > max) {
                max = sol / 2;//solutions are added twice
                pmax = perimeter;
            }
            sol = 0;
            perimeter++;
        }
        System.out.println("Perimeter " + pmax + " has " + max + " solutions");
    }
}
