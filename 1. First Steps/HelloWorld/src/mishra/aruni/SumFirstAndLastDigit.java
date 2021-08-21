package mishra.aruni;

public class SumFirstAndLastDigit {

    public static int sumFirstAndLastDigit(int num){

        if(num<0){
            return -1;
        }
        int lastDigit = num % 10;
        int firstDigit =0;

        while(num>=1){
            if(num<=9){
                firstDigit = num;
                break;
            }
            num /= 10;

            System.out.println(num);
        }

        return firstDigit+lastDigit;
    }
}
