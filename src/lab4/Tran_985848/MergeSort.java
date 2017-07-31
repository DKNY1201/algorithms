package lab4.Tran_985848;

/**
 * Created by Bi on 7/30/17.
 */
public class MergeSort {
    int[] theArr;

    public void mergeSort(int[] tempArr, int bot, int top) {
        if (bot == top) {
            return;
        } else {
            int mid = (bot + top) / 2;
            mergeSort(tempArr, bot, mid);
            mergeSort(tempArr, mid + 1, top);
            merge(tempArr, bot, mid + 1, top);
        }


    }

    public void merge(int[] tempArr, int bot, int mid, int top) {
        int totalEle = top - bot + 1;
        int i = bot;
        int j = mid;
        int pos = 0;

        int lowerBound = mid - 1;
//        System.out.println(lowerBound + " " + top);

        while (i <= lowerBound && j <= top) {
            if (theArr[i] <= theArr[j]) {
                tempArr[pos++] = theArr[i++];
            } else {
                tempArr[pos++] = theArr[j++];
            }
        }

        while (i <= lowerBound) {
            tempArr[pos++] = theArr[i++];
        }

        while (j <= top) {
            tempArr[pos++] = theArr[j++];
        }

        for (int k = 0; k < totalEle; k++) {
            theArr[bot + k] = tempArr[k];
        }

    }

    private void displayArray(int[] arr){
        for(int i = 0; i < arr.length; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        ms.theArr = new int[] {710, 659, 798, 563, 896, 787, 204, 25, 792, 983, 933, 951, 396, 234, 296, 815, 441, 167, 514, 298, 687, 272, 59, 87, 915, 905, 803, 882, 189, 956, 376, 660, 687};
        ms.displayArray(ms.theArr);
        int[] tempArr = new int[ms.theArr.length];
        ms.mergeSort(tempArr, 0, ms.theArr.length - 1);
        ms.displayArray(ms.theArr);
    }

}
