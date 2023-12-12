package lesson14.HomeWork;

import java.util.*;

public class SetUtilslmpl implements SetUtils {
    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
        TreeSet<String> result = new TreeSet<>();
        for (Integer integer : collection1) {
            result.add(String.valueOf(integer));
        }
        result.addAll(set2);
        return result.descendingSet();
    }

    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        Set<Integer> result = new LinkedHashSet<>();
        result.add(val1);
        result.add(val2);
        result.add(val3);
        result.add(val4);
        result.add(val5);
        return result;
    }
}
