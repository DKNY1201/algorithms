package lab1;

import java.util.*;

/**
 * Created by Bi on 7/25/17.
 */
public class prob3 {

    public static List<List<Integer>> powerSet(List<Integer> list) {

        List<List<Integer>> P = new ArrayList<>();
        List<Integer> S = new ArrayList<>();
        P.add(S);
        if (list.isEmpty()) {
            return P;
        }

        while (!list.isEmpty()) {
            int f = list.remove(0);

            List<List<Integer>> temp = new ArrayList<>();

            for (List<Integer> x: P) {
                temp.add(x);
            }

            for (List<Integer> x: temp) {
                List<Integer> T = new ArrayList<>();
                T.addAll(x);
                T.add(f);
                P.add(T);
            }
        }

        return P;

    }

    public static List<Integer> subSetSum(List<Integer> S, int k) {
        List<List<Integer>> subSet = powerSet(S);
        for (List<Integer> sub: subSet) {
            int sum = 0;
            for (Integer i: sub) {
                sum += i;
            }
            if (sum == k) {
                return sub;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(24);
        list.add(1);
        list.add(15);
        list.add(3);
        list.add(4);
        list.add(15);
        list.add(3);
        System.out.println(subSetSum(list, 55));
    }
}