package lab2.prob2;

/**
 * Created by Bi on 7/25/17.
 */
public class Merge {
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length + i] = arr2[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] merge2(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, pos = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr[pos++] = arr1[i++];
            } else {
                arr[pos++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            arr[pos++] = arr1[i++];
        }

        while (j < arr2.length) {
            arr[pos++] = arr2[j++];
        }

        return arr;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 8, 17};
        int[] arr2 = {2, 4, 8, 11, 13, 21, 23, 25};
        printArr(merge(arr1, arr2));
        printArr(merge2(arr1, arr2));
    }
//Algorithm merge(A, B)
//    Input: 2 sorted arrays need to merged A & B
//    Output: The sorted array contains all elements from A & B
//
//    C = new Array[A.length + B.length]
//    i <- 0 // keep track index of A
//    j <- 0 // keep track index of B
//    p <- 0 // keep track index of C
//
//    while i < A.length & j < B.length do
//        if A[i] <= B[j] then
//            C[p++] = A[i++]
//        else
//            C[p++] = B[j++]
//
//    while i < A.length
//        C[p++] = A[i++]
//
//    while j < B.length
//        C[p++] = B[j++]
//
//    return C


//Algorithm merge(A, B)
//    Input: 2 sorted arrays need to merged A & B
//    Output: The sorted array contains all elements from A & B
//
//    C = new Array[A.length + B.length]
//    for i <- 0 to A.length - 1 do
//        C[i] = A[i]
//
//    for i <- 0 to B.length - 1 do
//        C[A.length + i] = B[i]
//
//    for i <- 0 to C.length - 1 do
//        for j <- i to C.length - 1 do
//            if C[i] > C[j] then
//                temp = C[i]
//                C[i] = C[j]
//                C[j] = temp
//
//    return C


}