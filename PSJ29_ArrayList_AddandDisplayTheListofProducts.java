import java.util.ArrayList;
import java.util.Scanner;
public class PSJ29_ArrayList_AddandDisplayTheListofProducts {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> input = new ArrayList<>();

            System.out.println("Enter the product name (type 'exit' to stop) : ");

            while (true) {
                String name = scanner.nextLine();

                if (name.equalsIgnoreCase("exit")) {
                    break;
                }

                input.add(name);
            }
            System.out.println("Products added : \n" + input);
        }
    }
}
