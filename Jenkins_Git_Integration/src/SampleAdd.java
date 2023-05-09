import java.util.Scanner;

public class SampleAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x;
        while (true) {
            try {
                x = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.print("Invalid input. Please enter an integer value for x: ");
                scanner.nextLine();
            }
        }

        System.out.print("Enter the value of y: ");
        int y;
        while (true) {
            try {
                y = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.print("Invalid input. Please enter an integer value for y: ");
                scanner.nextLine();
            }
        }

        int ans = x + y;

        System.out.println("The sum of x and y is: " + ans);

        scanner.close();
    }
}
