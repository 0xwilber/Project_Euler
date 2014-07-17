package Project_Euler;

public class PerfectQuotients{
    
    public static void main(String[] args){
        
        long num = (long)Math.pow(10,8);
        long On=0,n=0;
        double Pn =0;
        long[] sum = new long[1000];
        int count=0;
        for (long i =1; i<=num; i++){
            Pn = calcOn(i)/i;
            String a = String.valueOf(Pn);
            if (a.endsWith(".5")){
                System.out.println(a);
                sum[count] = Integer.parseInt(a);
                count++;
            }
                
        }
    }
    
    private static long calcOn(long n){

        long[] numbers = new long[100000]; //holds divisors
        int count=0;
        
        for (long i=1; i<=n; i++){
            if (n%i==0){
                numbers[count] = i;
                count++;
            }     
        }
        long ans=0;
        for (long x : numbers){
            ans+=x;
        }
        return ans;
    }
}