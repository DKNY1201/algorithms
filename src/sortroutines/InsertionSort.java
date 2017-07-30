package sortroutines;

import runtime.Sorter;

public class InsertionSort extends Sorter {
	public int[] sort(int[] anArray) {
		  if(anArray == null || anArray.length <= 1) {
			return anArray;
		  }
		  int len = anArray.length;
		  int temp = 0;
		  int j = 0;
		  for(int i = 1; i < len; ++i) {
		    temp = anArray[i];
		    j=i;
		    while(j>0 && temp < anArray[j-1]){
		       anArray[j] = anArray[j-1];
		       j--;
		    }
		    anArray[j]=temp;
		  }
		  return anArray;
	}
}


//Algorithm mergeSort(S)
//	Input sequence S with n integers
//	Output sequence S sorted
//	if S.size() > 1 then
//		if S.size() <= 20 then
//			insertionSort(S)
//		else
//			(S1, S2) <- partition(S, n/2)
//			mergeSort(S1)
//			mergeSort(S2)
//			S <- merge(S1, S2)
//	return S