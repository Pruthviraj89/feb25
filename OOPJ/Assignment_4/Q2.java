package Assignment3;
import java.util.*;
 class Student{
	private String name;
	private int marks[]=new int[3];
	{
		name=null;
		for(int x: marks) {
			x=0;
		}
	}
	Student(){
		
	}
	 Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}
	public int total() {
		int total=0;
		for(int x:marks) {
			total+=x;
		}
		return total;
	}
	public double averageMarks() {
		double avg= total()/marks.length;
		return avg;
	}
	
	public void display() {
		System.out.printf("Average Marks: %.2f | ",averageMarks());
		System.out.println("Name: "+name+" | Total Marks: "+total()+"/30");
	}
}







public class Q2 {
	public static void main(String[] args) {
		
		List<Student> ls=new ArrayList<Student>();
		ls.add(new Student("Pruthviraj",new int[] {8,8,9}));
		 ls.add(new Student("Payal", new int[]{9, 7, 8}));
	      ls.add(new Student("Raj", new int[]{6, 9, 7}));
	        ls.add(new Student("Sneha", new int[]{10, 9, 8}));
	        ls.add(new Student("Amit", new int[]{7, 8, 8}));
	        ls.add(new Student());
		for(Student s:ls) {
			s.display();
		}
		
	}

}
