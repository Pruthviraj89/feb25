public class P1 {

    public static void main(String[] args) {
        
        // Declare and initialize primitive data types
        byte byteVar = 10;               // Range: -128 to 127
        short shortVar = 20;             // Range: -32,768 to 32,767
        int intVar = 1000;               // Range: -2^31 to 2^31-1
        long longVar = 100000L;          // Range: -2^63 to 2^63-1
        float floatVar = 5.75f;          // Range: approx. -3.4E+38 to 3.4E+38
        double doubleVar = 19.99;        // Range: approx. -1.8E+308 to 1.8E+308
        char charVar = 'A';              // Range: 0 to 65535 (Unicode values)
        boolean booleanVar = true;       // Values: true or false
        
        // Default values of uninitialized primitive variables
        byte byteDefault = 0;
        short shortDefault = 0;
        int intDefault = 0;
        long longDefault = 0L;
        float floatDefault = 0.0f;
        double doubleDefault = 0.0;
        char charDefault = '\u0000';      // Unicode for the default empty character
        boolean booleanDefault = false;  // Default value of boolean is false

        // Print assigned values
        System.out.println("Assigned Values:");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + booleanVar);

        // Print default values
        System.out.println("\nDefault Values (uninitialized):");
        System.out.println("byte: " + byteDefault);
        System.out.println("short: " + shortDefault);
        System.out.println("int: " + intDefault);
        System.out.println("long: " + longDefault);
        System.out.println("float: " + floatDefault);
        System.out.println("double: " + doubleDefault);
        System.out.println("char: " + charDefault);
        System.out.println("boolean: " + booleanDefault);
    }
}
