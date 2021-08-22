package mishra.aruni;

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        int sum;
        try (Scanner scanner = new Scanner(System.in)) {
            sum = 0;

            for (int i = 0; i < 10; i++) {
                System.out.print("Enter the number " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    sum += number;
                } else {
                    System.out.println("INVALID INPUT!");
                    i--;
                }
                scanner.nextLine();
            }
        }
        System.out.println("Sum of numbers: " + sum);
    }
}
