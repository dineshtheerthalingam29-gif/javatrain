package Day15;

import java.util.*;

public class TerminalOperation{

    public static void main(String[] args){

        List<Integer> list=Arrays.asList(10,20,30,40);

        long count=list.stream().count();

        System.out.println(count);

    }

}