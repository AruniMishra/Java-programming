package mishra.aruni;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("hello World");
//        System.out.println("args = " + Arrays.deepToString(args));

//        SpeedConverter speedConverter = new SpeedConverter();
//        speedConverter.printConversion(95.75);

//        System.out.println( NumberOfDaysInMonth.isLeapYear(1600));
//
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(12,10000));

        //System.out.println(SumDigit.sumDigits(91345));
        //System.out.println( SumFirstAndLastDigit.sumFirstAndLastDigit(23251));

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());


    }



}
