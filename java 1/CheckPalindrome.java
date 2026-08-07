import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the full input string line
        if (!sc.hasNextLine()) return;
        String s = sc.nextLine();
        
        // Filter only alphanumeric characters and convert to lowercase
        StringBuilder cleanStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanStr.append(Character.toLowerCase(c));
            }
        }
        
        // Check if the cleaned string reads the same forwards and backwards
        String normal = cleanStr.toString();
        String reversed = cleanStr.reverse().toString();
        
        if (normal.equals(reversed)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        sc.close();
    }
}