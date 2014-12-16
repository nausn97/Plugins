class Majority{
	public static void main(String[] args){
		int[] arr = {1,1,1,2,3,2,2,2,7,0};
		int res = findMajority(arr);
		System.out.println("Majority Element is :"+res);

	}

	public static int findMajority(int[] input){
		int maj = 0,count=0;
		for(int i=1;i<input.length-1;i++){
			if(input[maj]==input[i])
				count++;
			else{
				maj = i;
				count--;
			}
			if(count == 0){
				maj = i;
				count = 1;
			}
			
		}
		return input[maj];

		

	}
}