package mishra.aruni;

public class SumDigit {

    public static int sumDigits(int num) {

        if (num < 0) {
            return -1;
        } else if (num < 10) {
            return num;
        } else {
            int sum = 0;
            for (int i = 1; i <= num; ) {
                sum += num % 10;
                num = num / 10;
                System.out.println(sum + " & " + num);
            }
            return sum;
        }
    }
}
