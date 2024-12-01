import java.util.Scanner;
public class PSJ14_Methods_CalculateExponents {

    public static int calculateExponents (int fnumber, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= fnumber;
        }
        return result;
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number : ");
            int fnumber = scanner.nextInt();
            System.out.print("Enter the exponent number : ");
            int exponent = scanner.nextInt();
            int result = calculateExponents(fnumber, exponent);
            System.out.println(fnumber + " raised to the power of " + exponent + " equals " + result);
        }
    }
}