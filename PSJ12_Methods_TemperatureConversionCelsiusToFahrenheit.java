import java.util.Scanner;
public class PSJ12_Methods_TemperatureConversionCelsiusToFahrenheit {
    
    public static double convertToFahrenheit (double Celsius) {
        return ( (Celsius * 9/5) + 32);
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter temperature (Celsius) : ");
            double Celsius = scanner.nextInt();
            double result = convertToFahrenheit(Celsius);
            System.out.println(Celsius +  "\u00B0C = " + result + "\u00B0F");
        }
    }
}
