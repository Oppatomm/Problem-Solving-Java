import java.util.Scanner;
import java.text.DecimalFormat;
public class PSJ03_DataTypeDouble_CalculateBMI {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter weight : ");
            double weight = scanner.nextDouble();
            System.out.print("Enter height : ");
            double height = scanner.nextDouble();
            DecimalFormat format = new DecimalFormat("#.##");
            double result = weight / Math.pow(height , 2);
            System.out.println("BMI value is " + format.format(result));
        }
    }
}
