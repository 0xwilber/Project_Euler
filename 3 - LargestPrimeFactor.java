package Project_Euler;

public class LargestPrimeFactor {

    public static void main(String[] args) {

        long divisor=2;
        long x = 600851475143L;
        while (x> divisor){
            if (x%divisor==0)
                x=x/divisor;
            else
                divisor++;
                
        } //end while
        System.out.println("Largest prime factor: " + divisor);
    }

}