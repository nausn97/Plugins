import java.util.*;
class Sort{
	public static void main(String args[]){
		int[] arr = {6,3,1,7,9,3};
		int res[] = insertionSort(arr);
		
		for(int a : res){
			System.out.println(" "+a);
		}
	}
	public static int[] insertionSort(int[] arrayToSort){
		int len = arrayToSort.length;
		int temp;
		int j;
		for(int i = 1; i < len; i++){
			temp = arrayToSort[i];
			j = i - 1;
			while(j>=0 && arrayToSort[j] > temp ){				
				
				arrayToSort[j+1] = arrayToSort[j];			

				j--;

				
			}
			arrayToSort[j+1] = temp;
		}
		return(arrayToSort);
	}
}