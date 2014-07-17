package Project_Euler;

public class nthPrime{
    
    public static void main(String[] args){
        int count=0;
        for (int i=0; i<=10000000; i++){
            if (isPrime(i))
                count++;
            if (count==10002) //first prime is at 0
            {
                System.out.println("The 10001st prime is: " + i);
                break;
                
            }
                
        }
    }
    
    private static boolean isPrime(int n){
        
        if (n%2==0) return n==2;
        if (n%3==0) return n==3;
        int step=4, m=(int)Math.sqrt(n)+1;
        for (int i=5; i<m; step=6-step, i+=step){
            if (n%i==0) return false;
        }
        return true;
    }
}