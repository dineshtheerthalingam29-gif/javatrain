package Day15;
import java.util.*;

public class MethodReference{

    public static void main(String[] args){

        List<String> list=Arrays.asList("Java","Python","C");

        list.forEach(System.out::println);

    }

}