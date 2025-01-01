import java.util.Scanner;
public class PSJ16_Methods_CheckPrimeNumber {
    public static boolean checkPrimeNumber (int num) {
        if (num <= 1) {
            return false;
        }if  (num <= 3) {
            return true;
        }if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }i += 6;
        }return true;
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number : ");
            int num = scanner.nextInt();
            if (checkPrimeNumber(num)) {
                System.out.println(num + " is a prime number");
            }else {
                System.out.println(num + " Not a prime number");
            }
        }
    }
}