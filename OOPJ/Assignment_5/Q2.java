package assignment5;
import java.util.*;
class Student{
	private String name;
	private int rollno;
	private double marks[]=new double[5];
	public Student(String name, int rollno, double[] marks) {
			this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
	
	double calculateAverage() {
		double sum=0;
		for(double m: marks) {
			sum+=m;
		}
		sum=sum/marks.length;
	return sum;	
	}
	char calculateGrade() {
		char grade = (calculateAverage() >= 90) ? 'A' :
            (calculateAverage() >= 80) ? 'B' :
            (calculateAverage() >= 70) ? 'C' :
            (calculateAverage() >= 60) ? 'D' : 'F';
			return grade;
	}
	
	void displayStudentInfo() {
		System.out.println("Student Name: "+name+"\nRollno: "+rollno+"\naverage: "+calculateAverage()+"\nGrade: "+calculateGrade());
		
	}
	
	
	
}






public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double marks[]=new double[5];
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter name");
			String name=sc.next();
			if(name.matches("[A-Za-z]+"))
			{
			//sc.nextLine();
			System.out.println("Enter roll");
			int rollno=sc.nextInt();
			for(int i=0;i<marks.length;i++) {
					System.out.println("Enter marks");
					double value=sc.nextDouble();
					if(value<0 || value>100)
						throw new IllegalArgumentException("Enter the Valid Marks");
					else
						marks[i]=value;		
			}
			
			Student s=new Student(name,rollno,marks);
			s.displayStudentInfo();
			
			
			}else {
				throw new InputMismatchException("Name is not Valid");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}