package Assignment3;

import java.util.*;
class BMICalculator{
	private double height;
	private double weight;
	
	BMICalculator(){}
	BMICalculator(double height,double weight){
		this.height=height;
		this.weight=weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	double calculateBMI() {
		 double BMI= getWeight()/(getHeight()*getHeight());
		 return BMI;
	}
}

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMICalculator b=new BMICalculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Height: ");
		double  height=sc.nextDouble();
		System.out.println("Enter weight	: ");
		double weight=sc.nextDouble();
		b.setHeight(height);
		b.setWeight(weight);
	System.out.printf("%.2f",b.calculateBMI());
		
	}

}
