import java.util.Scanner;
public class PSJ07_DataTypeBoolean_CheckEvenOrOddNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter one digit : ");
            int number = scanner.nextInt();
            boolean result = number % 2 == 0;
            if (result) {
                System.out.println(number + " is an even number");
            }else {
                System.out.println(number + " is an odd number");
            }
        }
    }
}
