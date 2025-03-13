import java.util.*;
class P13{
public static void main(String ...args){
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int mask = num >> 31;
	
	int result=(num + mask) ^ mask;
	
	System.out.println("Absolute value of " + num + " is: " + result);

}


}