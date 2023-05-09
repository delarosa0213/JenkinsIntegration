import java.util.Scanner;

public class SampleAdd {
    public static void main(String[] args) {
        int y = 10;
        int x = 0;
        int ans = 0;
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter the value of x: ");
                x = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer value for x:");
                scanner.nextLine();
            }
        }

        scanner.close();

        ans = x + y;

        System.out.println("x + y = " + ans);
    }
}
