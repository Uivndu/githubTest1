import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();
        
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Child");
        }
        
        scanner.close();
    }
}
