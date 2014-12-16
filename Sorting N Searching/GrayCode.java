class GrayCode{
	String str;
	int len;
	public static void main(String[] args) {
		String binaryString = "1001001";
		GrayCode obj = new GrayCode(binaryString);
		String GCode  = obj.ConvertGrayCode();
		System.out.println("Gray Code :"+GCode);
	
	}	
	public GrayCode(String bStr){
		this.str = bStr;
		this.len = bStr.length();
	}
	public String ConvertGrayCode(){
		char[] res = new char[len];
		res[0] = str.charAt(0);
		for (int i=1;i<len;i++ ) {
			res[i] = Integer.parseInt(str.charAt(i)) ^ Integer.parseInt(str.charAt(i+1));
		}
		//String newStr = new String(res);
		return (new String(res));
	}
}