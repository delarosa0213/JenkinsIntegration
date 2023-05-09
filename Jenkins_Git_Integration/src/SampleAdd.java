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
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer value for x:");
                if (sc.hasNextLine()) {
                    sc.nextLine();
                } else {
                    break; // exit the loop if there is no more input
                }
            }
        }
        
        int y = 10;
        int sum = x + y;
        System.out.println("Sum of x and y is: " + sum);
    }
}
