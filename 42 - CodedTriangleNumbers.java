package Project_Euler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CodedTriangleNumbers {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("words.txt"));
        int num = 0;
        String[] line = br.readLine().split(",");
        for (String s : line) {
            s = s.replace("\"", "");
            if (isTriWord(s)) {
                num++;
            }
        }
        br.close();
        System.out.println("Number of triangle words is " + num);
    }

    private static boolean isTriWord(String s) {
        char[] c = s.toLowerCase().toCharArray();
        int num = 0;
        for (char d : c) {
            num += d - 'a' + 1;
        }
        for (double i = 1; i <= 20; i++) {
            double tri = (0.5 * i) * (i + 1);
            if (num == tri) {
                return true;
            }
        }
        return false;
    }
}
