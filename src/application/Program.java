package application;

import java.util.Arrays;
import java.util.List;

public class Program {
    
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Maria", "Alex", "bob");
        printList(myStrs);

    }

    public static void printList(List<?> list){
        //list.add(3);     Não é possível adicionar à lista curinga, pois  o compilador não sabe se a tipagem do que foi adicionado é compatível com a lista

        for (Object obj: list){
            System.out.println(obj);
        }
    }
}
