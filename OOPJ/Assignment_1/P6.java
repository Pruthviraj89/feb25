import java.util.*;

class P6{


public static void main(String ...args){
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Full Name");
	String fullName=sc.nextLine();
	
	for(int i=0;i<fullName.length();i++){
		if(fullName.charAt(i) != ' '){
		int a=(int) fullName.charAt(i);
		System.out.println("character "+fullName.charAt(i)+" has value "+a);
		}

	}
		
	
}



}