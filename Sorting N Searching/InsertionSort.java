class InsertionSort{
	int[] inputArr;
	int len;
	//int[] temp;
	public static void main(String[] args) {
		int[] arr = {65,7,12,98,32,45,67,10,5,19};
		InsertionSort obj = new InsertionSort(arr);		
		obj.doInsertionSort(1,1,3);
		obj.doInsertionSort(0,5,obj.len-3);
		for (int a:arr ) {
			System.out.print(a+" ");
		}

	}

	public InsertionSort(int [] arr){
		this.inputArr = arr;
		this.len = arr.length;		
		
		//000System.out.print("Returning from Constructor");
	}

	public void doInsertionSort(int flag,int SIndex,int EIndex){
		int i ;
		int temp ;
		for(int j=SIndex;j<=EIndex;j++)	{
			temp = inputArr[j];
			i = j - 1;
			if (flag == 1) {
				while(i>=0 && inputArr[i] > temp){
				inputArr[i+1] = inputArr[i];
				i--;
			}
			inputArr[i+1] = temp;
			}
			else if (flag == 0) {

				while(i>=0 && inputArr[i] < temp){
					inputArr[i+1] = inputArr[i];
					i--;
			}
				inputArr[i+1] = temp;
				
			}
		}

		
	}

	

}