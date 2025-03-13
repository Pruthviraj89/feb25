import java.util.*;
class P15{



	public static void main(String ...args){

	Scanner sc=new Scanner(System.in);
	
	int x=sc.nextInt();
	int odd=(x & 0xAAAAAAAA )>>1;
	int even=(x & 0x55555555)<<1;
	
	int result=odd|even;
	System.out.println(result);	
}





}