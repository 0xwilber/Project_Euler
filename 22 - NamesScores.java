package Project_Euler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NamesScores {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("names.txt"));
        String line = null;
        String[] names = new String[5163];
        int i = 0;
        while ((line = br.readLine()) != null) {
            String[] split = line.split(",");
            for (String x : split) {
                names[i] = x.replace("\"", "");
                i++;
            }
        }
        br.close();
        //BufferedWriter bw = new BufferedWriter(new FileWriter("sorted.txt"));
        long total = 0, a = 1;
        String[] sorted = sort(names);
        for (String s : sorted) {
            //bw.write(s + "\r\n");
            total += (stringVal(s) * a);
            a++;
        }
        //bw.close();
        System.out.println("Done. Answer is: " + total);
    }

    private static int stringVal(String s) {
        char[] name = s.toLowerCase().toCharArray();
        int ans = 0;
        for (char c : name) {
            ans += c - 'a' + 1;
        }
        return ans;
    }

    private static String[] sort(String[] names) {
        int loop;
        for (int j = 0; j < names.length; j++) {
            for (int i = 0; i < names.length - 1; i++) {
                loop = strcmp(names[i], names[i + 1]);
                if (loop > 0) {//if i is greater than i+1
                    String temp = names[i + 1];
                    String temp1 = names[i];
                    names[i + 1] = temp1;
                    names[i] = temp;
                }
            }
        }
        return names;
    }

    private static int strcmp(String a, String b) {
        if(a.startsWith("AL")){
            int x=0;
        }
        char[] first = a.toLowerCase().toCharArray();//i
        char[] second = b.toLowerCase().toCharArray();//i+1 

        int min = Math.min(first.length, second.length);
        int counter = 0;
        for (int i = 0; i < min; i++) {
            if ((int) first[i] > (int) second[i]) {
                counter++;
                break;
            } else if ((int) first[i] < (int) second[i]) {
                counter--;
                break;
            } //if already in order
            else {
            } //chars equal
        }
        if(counter == 0) {
            if(first.length > second.length)
                counter=1;
        }
         //ali compared to alice would equal 0
        return counter;
    }
}
