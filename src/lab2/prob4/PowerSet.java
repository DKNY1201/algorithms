package lab2.prob4;

import java.util.*;

/**
 * Created by Bi on 7/25/17.
 */
public class PowerSet {
    public static List<Set<Integer>> powerSet(List<Integer> list) {

        List<Set<Integer>> P = new ArrayList<>();
        Set<Integer> S = new HashSet<>();
        P.add(S);
        if (list.isEmpty()) {
            return P;
        }

        while (!list.isEmpty()) {
            int f = list.remove(0);

            List<Set<Integer>> temp = new ArrayList<>();

            for (Set<Integer> x: P) {
                temp.add(x);
            }

            for (Set<Integer> x: temp) {
                Set<Integer> T = new HashSet<>();
                T.addAll(x);
                T.add(f);
                P.add(T);
            }
        }

        return P;

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        System.out.println(powerSet(list));
    }
}
