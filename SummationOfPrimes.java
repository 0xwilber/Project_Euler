package Project_Euler;

public class SummationOfPrimes{
    
    public static void main(String[] args){
        
        long ans=0;
        for (int i=2; i<2000000; i++){
            if (isPrime(i))
                ans+=i;
        }

        System.out.println("Sum of primes: "+ans);
    }
    
    private static boolean isPrime(int n){

        for (int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    
}