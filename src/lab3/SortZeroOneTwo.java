package lab3;

/**
 * Created by Bi on 7/28/17.
 */
public class SortZeroOneTwo {

//    int[] finalSortedArr;

    public int[] sortZeroOneTwo(int[] A) {
        if (A == null || A.length <= 1) {
            return A;
        }

        int[] finalSortedArr = new int[A.length];

        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                countZero++;
            }

            if (A[i] == 1) {
                countOne++;
            }

            if (A[i] == 2) {
                countTwo++;
            }


        }

        for (int i = 0; i < countZero; i++) {
            finalSortedArr[i] = 0;
        }

        for (int i = countZero; i < countZero + countOne; i++) {
            finalSortedArr[i] = 1;
        }

        for (int i = countZero + countOne; i < A.length; i++) {
            finalSortedArr[i] = 2;
        }

        return finalSortedArr;
    }

//    public void writeToFinalSortedArray(int valToWrite, int startIndex, int len) {
//        for (int i = 0; i < len; i++) {
//            finalSortedArr[startIndex + i] = valToWrite;
//        }
//    }

    public void printArr(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortZeroOneTwo sortZeroOneTwo = new SortZeroOneTwo();
        int[] sortedArr = sortZeroOneTwo.sortZeroOneTwo(new int[] {1,1,2,0,1,2,0,2,2,1,1,0,0});
        sortZeroOneTwo.printArr(sortedArr);
    }
}

//Algorithm sortZeroOneTwo(A)
//	Input: An array A contains list of elements have value 0 or 1 or 2
//    Output: An sorted array
//
//    if A = null || A.length <= 1 then
//        return A
//
//    finalSortedArr <- new int[A.length]
//
//    countZero <- 0
//    countOne <- 0
//    countTwo <- 0
//
//    for i <- 0 to A.length - 1 do
//        if A[i] = 0 then
//            countZero <- countZero + 1
//        if A[i] = 1 then
//            countOne <- countOne + 1
//        if A[i] = 2 then
//            countTwo <- countTwo + 1
//
//    for i <- 0 to countZero do
//        finalSortedArr[i] <- 0
//
//    for i <- countZero to countZero + countOne do
//        finalSortedArr[i] <- 1
//
//    for i <- countZero + countOne to A.length do
//        finalSortedArr[i] <- 2
//
//    return finalSortedArr