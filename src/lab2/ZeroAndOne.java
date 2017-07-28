package lab2;

/**
 * Created by Bi on 7/27/17.
 */
public class ZeroAndOne {
    static public void zeroAndOne1(int[] arr) {
        int i = 0;
        int count = 0;

        while (arr[i] == 0) {
            count++;
            i++;
        }

        System.out.println(count);
        System.out.println(arr.length - count);
    }

    static public int[] zeroAndOne(int[] A) {
        int[] zeroAndOne = new int[2];

        if (A.length == 0) {
            zeroAndOne[0] = 0;
            zeroAndOne[1] = 0;
            return zeroAndOne;
        }

        if (A[0] == 1) {
            zeroAndOne[0] = 0;
            zeroAndOne[1] = A.length;
            return zeroAndOne;
        }

        if (A[A.length - 1] == 0) {
            zeroAndOne[0] = A.length;
            zeroAndOne[1] = 0;
            return zeroAndOne;
        }

        return findBreakPoint(A, 0, A.length - 1);
    }

    static public int[] findBreakPoint(int[] A, int bot, int top) {
        int[] zeroAndOne = new int[2];

        int mid = (bot + top) / 2;

        if (A[mid] == 0 && A[mid + 1] == 1) {
            zeroAndOne[0] = mid + 1;
            zeroAndOne[1] = A.length - (mid + 1);
            return zeroAndOne;
        }

        if (A[mid] == 0 && A[mid + 1] != 1) {
            return findBreakPoint(A, mid + 1, top);
        }

        if (A[mid] == 1) {
            return findBreakPoint(A, bot, mid - 1);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] a = zeroAndOne(new int[] {0,0,0,0,1,1,1});
        int[] b = zeroAndOne(new int[] {0,0,0,0,0,0,0});
        int[] c = zeroAndOne(new int[] {});
        int[] d = zeroAndOne(new int[] {1,1,1,1,1,1,1});

        for (int i: c) {
            System.out.println(i);
        }
    }
}


//Algorithm zeroAndOne(A)
//    Input: An array A contains 0s, 1s in sorted order
//    Output: An array contains numbers of 0s and numbers of 1s
//
//    i <- 0
//    zeroCount <- 0
//
//    while A[i] == 0 do
//        zeroCount <- zeroCount + 1
//        i <- i + 1
//
//    return Array[zeroCount, A.length - zeroCount]

