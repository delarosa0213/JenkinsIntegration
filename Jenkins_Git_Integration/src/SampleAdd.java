
import java.util.Scanner;

public class SampleAdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the value of x: ");
		int x = scanner.nextInt();
		
		System.out.print("Enter the value of y: ");
		int y = scanner.nextInt();
		
		int ans = x + y;
		
		System.out.println("The sum of x and y is: " + ans);
		
		scanner.close();
	}
}
