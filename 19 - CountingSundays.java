package Project_Euler;

public class CountingSundays {

    public static void main(String[] args) {

        int numSundays = 0, feb = 28;
        int[] daysInMonth = {31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayCounter = 1;
        for (int i = 1900; i <= 2000; i++) {
            if (i % 100 == 0) {//leap year falls on century..
                if (i % 400 == 0) {//..only if it's divisible by 400
                    feb = 29;
                }
            } else if (i % 4 == 0) {
                feb = 29;
            } else {
                feb = 28;
            }
            for (int d = 0; d < daysInMonth.length; d++) {
                for (int j = 1; j <= daysInMonth[d]; j++) {

                    if (dayCounter == 7) {//if sunday
                        dayCounter = 0;
                        if (j == 1 && i != 1900) {
                            numSundays++;
                        }
                    }
                    dayCounter++;
                }
            }
        }
        System.out.println("Number of Sundays: " + numSundays);
    }//main
}