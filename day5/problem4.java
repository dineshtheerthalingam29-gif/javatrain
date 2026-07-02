package day5;

public class problem4 {
    import java.util.Scanner;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal: ");
        double p = sc.nextDouble();

        System.out.print("Rate: ");
        double r = sc.nextDouble();

        System.out.print("Time: ");
        double t = sc.nextDouble();

        System.out.println("Simple Interest = " + (p * r * t / 100));
}
}
