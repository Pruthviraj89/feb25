public class P4{

    public static void main(String[] args) {
        
        // Declare and initialize three int variables
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        
        // Calculate the sum of the numbers
        int sum = num1 + num2 + num3;
        
        // Calculate the average and use typecasting to convert to double
        double average = (double) sum / 3;
        
        // Display the result
        System.out.println("The average of " + num1 + ", " + num2 + " and " + num3 + " is: " + average);
    }
}
