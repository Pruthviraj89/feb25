package assignment5;
import java.util.*;

class ElectricityBills {
    String customerName;
    double unitConsumed;
    double billAmount;

    public ElectricityBills(String customerName, double unitConsumed) {
        this.customerName = customerName;
        this.unitConsumed = unitConsumed;
    }

    void calculateBillAmount() {
        if (unitConsumed > 0 && unitConsumed <= 100) {
            billAmount = unitConsumed * 5;
        } else if (unitConsumed > 100 && unitConsumed <= 300) {
            billAmount = unitConsumed * 7;
        } else if (unitConsumed > 300) {
            billAmount = unitConsumed * 7;
        }
    }

    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Unit Consumed: " + unitConsumed);
        System.out.println("Customer Final Bill Amount: " + billAmount);
    }
}

public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter customer name: ");
            String name = sc.next();
            System.out.print("Enter units consumed: ");
            String units = sc.next();

            
            if (name.matches("\\d+")) {  // If name contains only numbers, throw exception
                throw new InputMismatchException("Invalid Name: Cannot contain numbers.");
            }

            if (units.matches("\\D+")) {  // If units contain alphabets, throw exception
                throw new IllegalArgumentException("Invalid Units: Must be a number.");
            }

           
            double unitValue = Double.parseDouble(units);

       
            ElectricityBills b = new ElectricityBills(name, unitValue);
            b.calculateBillAmount();
            b.display();

        } catch (Exception e) {
        	e.printStackTrace();
        } finally {
            sc.close();  // ✅ Close scanner to avoid memory leaks
        }
    }
}
