package Assignment3;

class ElectricityBill{
	String customerName;
	double unitConsumed;
	double billAmount;
	public ElectricityBill(String customerName, double unitConsumed) {
		this.customerName = customerName;
		this.unitConsumed = unitConsumed;
	}
	
	void calculateBillAmount() {
				if(unitConsumed==0 || unitConsumed<=100) {
					billAmount=unitConsumed* 5;
				}else if(unitConsumed>100 || unitConsumed<=300) {
					billAmount=unitConsumed* 7;
				}else if(unitConsumed>300) {
					billAmount=unitConsumed* 7;
				}
	}
	void display() {
		System.out.println("Customer Name: "+customerName);
		System.out.println("Customer UnitConsumed: "+unitConsumed);
		System.out.println("Customer FinalBillAmount: "+billAmount);
		
	}
		
}








public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricityBill b=new ElectricityBill("Pruthviraj",89);
		b.calculateBillAmount();
		b.display();
	}

}
