package Day12;

public class Finally {


    public static void main(String[] args) {

        try {

            int a = 10 / 2;

            System.out.println(a);

        } finally {

            System.out.println("Finally Block Executed");

        }

    }
}
    