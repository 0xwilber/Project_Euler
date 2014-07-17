package Project_Euler;

public class MultiplesOf3And5{

    public static void main(String[] args){
        int[] multiples=new int[1000];
        int count=0;
        for (int i=0; i<1000; i++){
            if (i%3==0 || i%5==0){
                multiples[count] = i;
                count++;
            }      
        }
        int ans=0;
        for (int x : multiples){
            ans+=x;
        }
        
        System.out.println(ans);
    }
}