import java.util.Scanner;
import java.text.DecimalFormat;
public class PSJ04_DataTypeDouble_TemperatureConversion {
    public static void main(String[]args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Celsius : ");
            double celsius = scanner.nextDouble();
            double result = ( celsius * 9/5) + 32;
            DecimalFormat format = new DecimalFormat("#");
            System.out.print("Temperature " + format.format(celsius) + " Celsius = " + format.format(result) + " Fahrenheit");
        }
    }
}
