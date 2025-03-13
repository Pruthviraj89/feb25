import java.util.*;
class P8{





	public static void main(String ...agrs){

	Scanner sc=new Scanner(System.in);
	boolean n1=sc.nextBoolean();
	boolean n2=sc.nextBoolean();
	boolean n3=sc.nextBoolean();

	if(n1 && n2 || n2 && n3 || n1 && n3){
	System.out.println("True");
	}else{
		System.out.println("false");
	}


	}




}