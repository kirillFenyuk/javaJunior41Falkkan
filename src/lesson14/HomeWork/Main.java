package lesson14.HomeWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> array =new ArrayList<>();
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        LinkedList<Integer> linked = new LinkedList<>();
        linked.add(4);
        linked.add(5);
        linked.add(6);
        linked.add(7);

        CollectionsUtilsImpl util = new CollectionsUtilsImpl();

        Collection<Integer> unionResult = util.union(array,linked);
        System.out.println(unionResult);

        Collection<Integer> intersectionResult = util.intersection(array,linked);
        System.out.println(intersectionResult);

        Collection<Integer> unionWithoutDuplicateResult = util.unionWithoutDuplicate(array,linked);
        System.out.println(unionWithoutDuplicateResult);

        Collection<Integer> intersectionWithoutDuplicateResult = util.intersectionWithoutDuplicate(array,linked);
        System.out.println(intersectionWithoutDuplicateResult);

        Collection<Integer> differenceResult = util.difference(array,linked);
        System.out.println(differenceResult);
    }
}
