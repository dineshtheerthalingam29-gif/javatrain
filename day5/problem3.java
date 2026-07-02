package day5;

public class problem3 {
    import java.util.Scanner;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length: ");
        double l = sc.nextDouble();

        System.out.print("Breadth: ");
        double b = sc.nextDouble();

        System.out.println("Area = " + (l * b));
    }
}

