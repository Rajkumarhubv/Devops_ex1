package signin;
import java.util.Scanner;

public class Signin {
    public static void main(String[] args) {
        
        String correctUsername = "admin";
        String correctPassword = "password";

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Sign-In Successful!");
        } else {
            System.out.println("Invalid Username or Password!");
        }

       
        scanner.close();
    }
}
