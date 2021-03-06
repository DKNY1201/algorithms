package sortroutines;

import java.util.Arrays;

import runtime.Sorter;

/**
 * This is the slowest version of BubbleSort
 * No optimization for already sorted arrays.
 * Doesn't take into account the fact that
 * largest elements are pushed to the right.
 *
 */
public class BubbleSort1 extends Sorter {
	
	int[] arr;
	public int[] sort(int[] array){
		this.arr = array;
		bubbleSort();
		return arr;
		
	}
	private void bubbleSort(){
		
		int len = arr.length;
		for(int i = 0; i < len; ++i) {
			boolean isSwap = false;
			for(int j = 0; j < len-1; ++j) {
				if(arr[j]> arr[j+1]){
					swap(j,j+1);
					isSwap = true;
				}
			}
			if (!isSwap) {
                break;
            }
		}
	}
	
	int[] swap(int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
		
	}
	public static void main(String[] args){
		int[] test = {1,2,3,4,5,6,7,8,11,22,33,45};
		BubbleSort1 bs = new BubbleSort1();
		
		System.out.println(Arrays.toString(bs.sort(test)));
		
	}

}
