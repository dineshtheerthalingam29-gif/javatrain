import java.util.Scanner;

public class SimpleEventRegistration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Event Registration Form");

        System.out.print("First Name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Email: ");
        String email = scanner.nextLine().trim();

        System.out.print("Contact (10 digits): ");
        String contact = scanner.nextLine().trim();

        System.out.print("Event Name: ");
        String eventName = scanner.nextLine().trim();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        System.out.print("Re-type Password: ");
        String rePassword = scanner.nextLine();

        System.out.print("Gender (Male/Female/Other): ");
        String gender = scanner.nextLine().trim();

        // Simple validation
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()
                || contact.isEmpty() || eventName.isEmpty()
                || password.isEmpty() || rePassword.isEmpty()
                || gender.isEmpty()) {

            System.out.println("Error: All fields are required!");
            return;
        }

        if (!password.equals(rePassword)) {
            System.out.println("Error: Passwords do not match!");
            return;
        }

        if (!email.contains("@") || !contact.matches("\\d{10}")) {
            System.out.println("Error: Invalid email or contact!");
            return;
        }

        System.out.println("Registration Successful!");
        System.out.println("Event: " + eventName);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Contact: " + contact);
        System.out.println("Gender: " + gender);

        scanner.close();
    }
}