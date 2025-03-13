class P7{


public static void main(String ...args){


	int a=2014;
	
	if(a%400==0 ){
	System.out.println(a);
	}else if(a%4==0){
		if(a%100 !=0){
		System.out.println("This is leap year");
		}else{
	
		System.out.println("This is not leap year");
		}

	}else{
System.out.println("This is not leap year");
	}


}
}