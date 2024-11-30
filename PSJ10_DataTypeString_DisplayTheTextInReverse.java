import java.util.Scanner;
public class PSJ10_DataTypeString_DisplayTheTextInReverse {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter one text. : ");
            String text = scanner.nextLine();
            StringBuilder result = new StringBuilder(text);
            System.out.println("Output : " + result.reverse());
        }
    }
}
