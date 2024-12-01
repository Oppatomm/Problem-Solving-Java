import java.util.Scanner;
public class PSJ12_Methods_TemperatureConversionCelsiusToFahrenheit {
    
    public static int ConvertToFahrenheit (int Celsius) {
        return ( (Celsius * 9/5) + 32);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter temperature (Celsius) : ");
            int Celsius = scanner.nextInt();
            int result = ConvertToFahrenheit(Celsius);
            System.out.println(result);
        }
    }
}
