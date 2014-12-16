class MergeSort{
	int[] inputArr;
	int len;
	int[] temp;
	public static void main(String[] args) {
		int[] arr = {65,7,12,98,32,45,67,10,5,19};
		MergeSort obj = new MergeSort(arr);		
		for (int a:arr ) {
			System.out.print(a+" ");
		}

	}

	public MergeSort(int [] arr){
		this.inputArr = arr;
		this.len = arr.length;
		temp = new int[len];
		doMergeSort(0,len-1);
		//System.out.print("Returning from Constructor");
	}

	public void doMergeSort(int lIndex,int hIndex){
		
		if(lIndex < hIndex){
			int middle = (lIndex + hIndex)/2;
			doMergeSort(lIndex,middle);	
			doMergeSort(middle+1,hIndex);
			//System.out.print("doMergeSort");
			Merge(lIndex,middle,hIndex);
		}
	}

	public void Merge(int lIndex,int middle,int hIndex){
		for (int i=lIndex;i<=hIndex ;i++ ) {
			temp[i] = inputArr[i];
		}
		int i = lIndex;
		int j = middle+1;
		int k = lIndex;

		while (i<=middle && j<=hIndex) {
			if(temp[i]<=temp[j]){
				inputArr[k] = temp[i];
				i++;
			}
			else{
				inputArr[k] = temp[j];
				j++;
			}
			k++;
		}
		while(i<=middle){
			inputArr[k] = temp[i];
			i++;
			k++;
		}
	}

}