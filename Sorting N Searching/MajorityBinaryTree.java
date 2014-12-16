class Node{
	int count;
	int element;
	Node left;
	Node right;
	
}

class MajorityB{
	Node root = null;
	public static void main(String[] args) {
		int[] arr = {1,1,1,2,3,2,2,2,7,0};		
		MajorityB ob = new MajorityB();
		for(int i=0;i<arr.length;i++){

			int res = ob.search(arr[i],arr.length/2);
			System.out.println("res:"+res);
			if(res == 0){
				ob.insert(arr[i]);
			}
			else if(res == 2){
				System.out.println("Majority element is:"+arr[i]);
			}
			else{
				System.out.println("OOpsss No Majority element is Present in given Array");
			}
				
			
		}
		
	}
 
	public int search(int item,int len){
		Node temp = root;
		System.out.println("length:"+len);
		if(temp == null){
			return 0;
		}
		else{
			while(temp!=null){
				if(item == temp.element){
				temp.count++;
				if(temp.count > len){
					return 2;
				}				
				return 1;
			}
			else if(item < temp.element){
				temp = temp.left;
			}
			else if(item > temp.element){
				temp = temp.right;
			}

			}
			
		}
		return 0;
	}

	public void insert(int item){
		Node temp = root;
		Node obj = new Node();
		obj.left = null;
		obj.right = null;
		obj.element = item;
		obj.count = 1;
		System.out.println("hw");
		if(root == null){			
			root = obj;
		}
		else{
			while(true){
				if(item < temp.element){
					if(temp.left == null){
						temp.left = obj;					
					}
					else{
						temp = temp.left;
					}
				}
				else if (item > temp.element) {
					if (temp.right == null) {
						temp.right = obj;
					}
					else{
						temp = temp.right;
					}
				}

			}
			
		}
	}
}