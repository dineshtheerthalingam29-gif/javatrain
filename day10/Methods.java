package Day10;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

}

public class Methods {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));

    }
}