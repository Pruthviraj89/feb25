package Assignment3;
class Room{
	private double height;
	private double width;
	private double breadth;
	
	public Room(double height, double width, double breadth) {
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}

	public double  volume() {
		double volume=height * width* breadth;
		return volume;
	}
}
class RoomDemo{
	Room m;

	public RoomDemo(Room m) {
		this.m = m;
	}
	public void  display() {
			System.out.printf("%.2f",m.volume());
	}
}


public class Q1 {
	
	public static void main(String ...args) {
		RoomDemo r=new RoomDemo(new Room(5.10,8.9,3.56));
		r.display();
		
	}

}
