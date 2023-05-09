import java.util.Scanner;

public class SampleAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;

        // Prompt the user to enter a valid integer for x
        while (true) {
            System.out.print("Enter the value of x: ");
            if (sc.hasNextInt()) {
                x = sc.nextInt();
                sc.nextLine(); // consume the newline character left in the input buffer
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer value for x:");
                sc.nextLine(); // consume the entire line to clear the input buffer
            }
        }

        int y = 10;
        int sum = x + y;
        System.out.println("Sum of x and y is: " + sum);
    }
}
