package Assignment3;
class Box{
	private double height;
	private double width;
	private double breadth;
	public Box(double height, double width, double breadth) {
		super();
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	
		public double getVolume(){
			double volume=2* (height*width+ width*breadth+ height*breadth);
			return volume;
		}
		public double getArea(){
			double area=height* width* breadth;
			return area;
		}
		
		public void display() {
			System.out.printf("Volume: %.2f , Area: %.2f",getVolume(),getArea());
		}
	
}


public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1=new Box(5.6,3.2,6.8);
		b1.display();
	}

}
