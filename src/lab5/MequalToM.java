package lab5;

/**
 * Created by Bi on 7/31/17.
 */
public class MequalToM {
    public static int mequalToM(int[] arr, int bot, int top) {
        if (arr[0] == 0) return 0;
        if (arr[0] > 0) return -1;

        if (bot > top) {
            return -1;
        }

        int mid = (bot + top) / 2;

        if (arr[mid] == mid) {
            return mid;
        }

        if (arr[mid] > mid)
            return mequalToM(arr, bot, mid - 1);
        return mequalToM(arr, mid + 1, top);
    }

//Algorithm indexEqualToValue(A, b, t)
//    Input An sorted and distinct elements array A, lowest index of array b, highest index of array t
//    Output An integer m if A[m] = m
//
//    if (A[0] = 0) then
//        return 0
//    if ( b > t || A[0] > 0) then
//        return - 1
//
//    m = (b + t) / 2
//
//    if A[m] = m then
//        return m
//
//    if A[m] > m
//        return indexEqualToValue(A, b, m - 1)
//
//    return indexEqualToValue(A, m + 1, t)
    public static void main(String[] args) {
        int[] arr = new int[] {-13,-9,-7,-1,4,6,7,9,100};
        int m = mequalToM(arr, 0, arr.length - 1);
        System.out.println(m);
    }
}
