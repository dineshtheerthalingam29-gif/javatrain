package Day8;

interface Animal {

    void sound();

}

class Dog implements Animal {

    public void sound() {

        System.out.println("Dog Barks");

    }

}

public class Interface {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();

    }
}