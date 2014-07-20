package Project_Euler;

public class NumberLetterCount 
{
    
    public static void main(String[] args)
    {
        int numLetters=0;
        
        for (int i =1; i<=1000; i++)
        {
            System.out.println(getNumber(i));
            numLetters += getNumber(i).replaceAll("\\s+","").length();
        }
        System.out.println(numLetters);
    }
    
    private static String getNumber(int n)
    {
        if ((""+n).length() == 1)
        {
            return singleDigits(n);
        }
        else if ((""+n).length() == 2)
        {
            if (n<10)
                    return getNumber(n%n);

            else if (n==10)
                    return "ten";
                else if (n==11)
                    return "eleven";
                else if (n==12)
                    return"twelve";
                else if (n==13)
                    return "thirteen";
                else if (n==15)
                    return "fifteen";
                else if (n==18)
                    return "eighteen";
                else if (n<30&&n>=20)
                    return "twenty" + singleDigits(n%10);
                else if (n<40&&n>=30)
                    return "thirty" + singleDigits(n%10);
                 else if (n<50&&n>=40)
                    return "forty" + singleDigits(n%10);
                else if (n<60&&n>=50)
                    return "fifty" + singleDigits(n%10);
                else if (n<70&&n>=60)
                    return "sixty" + singleDigits(n%10);
                else if (n<80&&n>=70)
                    return "seventy" + singleDigits(n%10);
                else if (n<90&&n>=80)
                    return "eighty" + singleDigits(n%10);
                else if (n<100&&n>=90)
                    return "ninety" + singleDigits(n%10);
                else
                {
                    for (int i=4; i<=9;i++)
                    {
                        if((n-i)==10)
                            return (singleDigits(i)+"teen");
                    }
                } 
        }
        else if ((""+n).length() == 3)
        {
            if (n/100==1)
            {
                if ((n-100)==0)
                    return "onehundred";
                else
                    return "onehundredand" + getNumber(n-100);
            }
            else if (n/100==2)
            {
                if ((n-200)==0)
                    return "twohundred";
                else
                    return "twohundredand" + getNumber(n-200);
            }
            else if (n/100==3)
            {
                if ((n-300)==0)
                    return "threehundred";
                else
                    return "threehundredand" + getNumber(n-300);
            }
            else if (n/100==4)
            {
                if ((n-400)==0)
                    return "fourhundred";
                else
                    return "fourhundredand" + getNumber(n-400);
            }
            else if (n/100==5)
            {
                if ((n-500)==0)
                    return "fivehundred";
                else
                    return "fivehundredand" + getNumber(n-500);
            }
            else if (n/100==6)
            {
                if ((n-600)==0)
                    return "sixhundred";
                else
                    return "sixhundredand" + getNumber(n-600);
            }
            else if (n/100==7)
            {
                if ((n-700)==0)
                    return "sevenhundred";
                else
                    return "sevenhundredand" + getNumber(n-700);
            }
            else if (n/100==8)
            {
                if ((n-800)==0)
                    return "eighthundred";
                else
                    return "eighthundredand" + getNumber(n-800);
            }
            else if (n/100==9)
            {
                if ((n-900)==0)
                    return "ninehundred";
                else
                    return "ninehundredand" + getNumber(n-900);
            }
                
        }
        else
            return "onethousand";
        return "";
    }
    
    private static String singleDigits(int n)
    {
        if (n==1)
            return "one";
        else if(n==2)
            return "two";
        else if(n==3)
            return "three";
        else if(n==4)
            return "four";
        else if(n==5)
            return "five";
        else if(n==6)
            return "six";
        else if(n==7)
            return "seven";
        else if(n==8)
            return "eight";
        else if(n==9)
            return "nine";
        else //if zero
            return "";
    }
}