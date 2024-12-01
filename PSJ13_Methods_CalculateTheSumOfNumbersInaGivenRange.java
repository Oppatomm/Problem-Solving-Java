import java.util.Scanner;
public class PSJ13_Methods_CalculateTheSumOfNumbersInaGivenRange {
    
    public static int calculateSum (int a,int b) {
        int count = 0;
        for (int i = a;  i <= b; i++) {
            count += i;
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter start number : ");
            int a = scanner.nextInt();
            System.out.print("Enter end number : ");
            int b = scanner.nextInt();
            int result = calculateSum(a,b);
            System.out.println("The sum of " + a + " to " + b  + " is " + result);
        }
    }
}
