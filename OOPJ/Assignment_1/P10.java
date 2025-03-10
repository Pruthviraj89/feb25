import java.util.*;

class P10{
	
	public static void main(String ...args){
	
	
		Scanner sc= new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();

		if(num1==num2){
			System.out.println("true");	
		}else{
			if(num1>num2){
				
				System.out.println("num1 is greater");
				}else{
				if(num1<num2){
				System.out.println("num2 is greater");
				}else{
					if(num1<=num2){
						System.out.println("num1 is less than equal to num2");
					}else{
		System.out.println("num2 is less than equal to num2");
						}
					}		

			}
			

			}
	
	}
	




}