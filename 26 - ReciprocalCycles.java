package Project_Euler;

public class ReciprocalCycles {

    public static void main(String[] args) {
        int seqLen = 0, num = 0;
        for (int i = 1000; i > 1; i--) {
            if (seqLen >= i) {               
                break;
            }
            int[] rem = new int[i];
            int val = 1;
            int pos = 0;

            while (rem[val] == 0 && val != 0) {
                rem[val] = pos;
                val *= 10;
                val %= i;
                pos++;
            }
            if (pos - rem[val] > seqLen) {
                seqLen = pos - rem[val];
            }
            num = i;
        }
        System.out.println("Cycle length " + seqLen + " for number " + num);
    }
}
