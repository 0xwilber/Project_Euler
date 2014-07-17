package Project_Euler;

public class LargestPalindromeProduct {

    public static void main(String[] args){
       int product=0, temp=0, temp1=0;
       String ans="";
        for (int i = 100; i<=999; i++){
            for (int j=100; j<=999; j++){
                product = i*j;
                if (isPalindrome(product)==true){
                    temp = (i*j); //next val
                    if (temp > temp1){
                        ans = i + " * " + j + " = " + (i*j);
                    temp1 = (i*j); //previous val
                    }
                }
            }
        }
        System.out.println(ans); 
    }

    public static boolean isPalindrome(int n){
        int[] numSplit=new int[6];
        int length = String.valueOf(n).length();
        int i=0;
        while (n>0){
            int digit=n%10;
            numSplit[i] = digit;
            i++;
            n/=10;
        }
        if (length==5 && (numSplit[0] == numSplit[1])&& (numSplit[1] == numSplit[2])){
                return true;
        }
        else if (length==6 && (numSplit[0] == numSplit[5]) && (numSplit[1] == numSplit[4])
                    && (numSplit[2] == numSplit[3])){
                return true;
        }

        else
            return false;
          
    }
}
