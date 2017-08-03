package lab7;

/**
 * Created by Bi on 8/1/17.
 */
public class FindFirstNoDupElement {
    public static int findFirstNoDupElement(int[] arr) {
        int[] bucket = new int[3 * arr.length];

        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i]] += 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (bucket[arr[i]] == 1){
                return arr[i];
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findFirstNoDupElement(new int[] {1, 2, 4, 9, 3, 2, 1, 4, 5}));
    }
}


//Algorithm findFirstNoDupElement(A)
//    Input An array A
//    Output First integer that occurs in the array only once
//
//    bucket <- new int[3 * A.length]
//
//    for i <- 0 to A.length - 1 do
//        bucket[A[i]] <- bucket[A[i]] + 1
//
//    for i <- 0 to A.length - 1 do
//        if bucket[A[i]] = 1
//            return A[i]