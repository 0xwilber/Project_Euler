package Project_Euler;

public class SmallestMultiple {
    
    public static void main(String[] args){
        long ans=0;
        for (long i = 20000000; i<=10000000000L; i++){
            if (isEvenlyDivisible(i)==true){
                ans=i;
                System.out.println(ans);
                break;
            }
        }
        //System.out.println(ans);
    }
    
    public static boolean isEvenlyDivisible(long n){
       int count=0;
        for (int i=1; i<=20; i++){
            if (n%i==0)
               count++;
        }
        if (count==20)
            return true;
        else
            return false;
    }
    
}