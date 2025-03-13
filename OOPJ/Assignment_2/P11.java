class P11{



	public static void main(String ...args){

	
	int n=5;
	boolean temp=(n > 0) && ((n & (n - 1)) == 0);
	if(temp){

		System.out.println(n + " is a power of 2");

		}else{
	System.out.println(n + " is  not  of power of  2");

		}

	}



}