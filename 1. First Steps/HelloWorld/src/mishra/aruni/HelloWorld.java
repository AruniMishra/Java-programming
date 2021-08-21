package mishra.aruni;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello World");
        System.out.println("args = " + Arrays.deepToString(args));

//        SpeedConverter speedConverter = new SpeedConverter();
//        speedConverter.printConversion(95.75);

        System.out.println( NumberOfDaysInMonth.isLeapYear(1600));

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(12,10000));

    }



}
