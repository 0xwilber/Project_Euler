package Project_Euler;

public class EvenFibonacciNumbers {
    
    public static void main(String[] args){
        int a=1, b=2, ans=0, count=0;
        int evenTerms[] = new int[3000000];
        while (ans<4000000){
            ans = a+b;
            if (ans%2==0){
                evenTerms[count] = ans;
                count++;
            }
                
            a=b;
            b=ans;
        }
        int sum=0;
        for (int x : evenTerms){
            sum+=x;
        }
        System.out.println(sum+2);
    }
}