import java.util.*;
class P8{
	
	static void add(int n1,int n2){
		
	System.out.print(n1+"+"+n2+"=");
	System.out.println(n1+n2);
	}
	static void subtraction(int n1,int n2){
	System.out.print(n1+"-"+n2+"=");
	System.out.println(n1-n2);
	}
	static void multiplication(int n1,int n2){
		System.out.print(n1+"*"+n2+"=");
	System.out.println(n1*n2);
		}
	static void division(int n1, int n2){
		if(n1>n2){
		System.out.print(n1+"/"+n2+"=");
	System.out.println(n1/n2);
		}
	}
	static void modulus(int n1,int n2){
		if(n1>n2){

			System.out.print(n1+"%"+n2+"=");
	System.out.println(n1%n2);
		}

	}


	public static void main(String[] args){
	
		Scanner sc= new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		add(num1,num2);
		subtraction(num1,num2);
		multiplication(num1,num2);
		division(num1,num2);
		modulus(num1,num2);
		
}



}