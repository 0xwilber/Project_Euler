package Project_Euler;

public class SumSquareDifference{
    
    public static void main(String[] args){
        int sumOfSquares=0;
        int squareOfSum=0;
        for (int i=0; i<=100; i++){
            sumOfSquares+=(i*i);
            squareOfSum+=i;
        }
        squareOfSum=(squareOfSum*squareOfSum);
        int diff = squareOfSum-sumOfSquares;
        System.out.println(diff);
        
    }
}