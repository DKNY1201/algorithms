package lab2.prob5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Bi on 7/25/17.
 */
public class RemoveDups {
    public static List<Integer> removeDups(List<Integer> arr) {
        List<Integer> distinctList = new ArrayList<>();

        for (Integer i: arr) {
            if (!distinctList.contains(i)) {
                distinctList.add(i);
            }
        }

        return distinctList;
    }

    public static List<Integer> removeDups1(List<Integer> arr) {
        List<Integer> distinctList = new ArrayList<>();

        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for (Integer i: arr) {
            if (!hashMap.containsKey(i)) {
                distinctList.add(i);
            }
            hashMap.put(i, true);
        }

        return distinctList;
    }

    public static void main(String[] args) {
        System.out.println(removeDups(Arrays.asList(1,3,4,3,4,5,6,4)));
        System.out.println(removeDups1(Arrays.asList(1,3,4,3,4,5,6,4)));
    }
}
