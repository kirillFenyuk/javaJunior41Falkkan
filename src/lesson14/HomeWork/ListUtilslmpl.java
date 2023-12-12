package lesson14.HomeWork;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListUtilslmpl implements ListUtils {
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        List<String> result = new ArrayList<>();
        for (String i:strings){
            result.add(i);
        }
        return result;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        List<Double> result = new ArrayList<>(data);
        Collections.sort(result);
        Collections.reverse(result);
        return result;
    }
}
