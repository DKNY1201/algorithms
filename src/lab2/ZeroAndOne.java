package lab2;

/**
 * Created by Bi on 7/27/17.
 */
public class ZeroAndOne {
    static public void zeroAndOne(int[] arr) {
        int i = 0;
        int count = 0;

        while (arr[i] == 0) {
            count++;
            i++;
        }

        System.out.println(count);
        System.out.println(arr.length - count);
    }

    public static void main(String[] args) {
        zeroAndOne(new int[] {0,0,0,0,1,1,1});
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

