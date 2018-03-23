import java.util.Scanner;


public class TotalDigitsOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number n : ");
        int n = scanner.nextInt();
        System.out.printf("Sum "
                + "of %d is: %d", n, totalDigitsOfNumber(n));
    }

    public static int totalDigitsOfNumber(int n) {
        int total = 0;
        final int DEC_10 = 10;
        do {
            total = total + n % DEC_10;
            n = n / DEC_10;
        } while (n > 0);
        return total;
    }
}
