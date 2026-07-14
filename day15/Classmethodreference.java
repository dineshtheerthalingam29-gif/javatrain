package Day15;

import java.util.function.Function;

public class ClassMethodReference{

    static String convert(String s){

        return s.toUpperCase();

    }

    public static void main(String[] args){

        Function<String,String> f=ClassMethodReference::convert;

        System.out.println(f.apply("java"));

    }

}