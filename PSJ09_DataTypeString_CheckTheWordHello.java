import java.util.Scanner;
public class PSJ09_DataTypeString_CheckTheWordHello {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.print("Enter your text. : ");
            String text = scanner.nextLine();
            String word = "Hello";
            boolean result = text.contains(word);
            if (result) {
                System.out.println("The text contains the word 'Hello'.");
            }else {
                System.out.println("The text does not contain the word 'Hello'.");
            }
        }
    }
}
