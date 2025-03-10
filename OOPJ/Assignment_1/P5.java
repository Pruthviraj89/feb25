public class P5 {

    public static void main(String[] args) {
        
        // Binary literal (prefix: 0b or 0B)
        int binaryLiteral = 0b101010;  // Binary for 42
        System.out.println("Binary Literal: " + binaryLiteral); // Output: 42
        
        // Octal literal (prefix: 0 or 0O)
        int octalLiteral = 052;  // Octal for 42
        System.out.println("Octal Literal: " + octalLiteral); // Output: 42
        
        // Hexadecimal literal (prefix: 0x or 0X)
        int hexadecimalLiteral = 0x2A;  // Hexadecimal for 42
        System.out.println("Hexadecimal Literal: " + hexadecimalLiteral); // Output: 42
        
        // Floating-point literal (suffix: f or F for float, or d or D for double)
        float floatLiteral = 3.14f;   // Floating-point value for float
        double doubleLiteral = 3.14159;  // Floating-point value for double
        
        System.out.println("Float Literal: " + floatLiteral); // Output: 3.14
        System.out.println("Double Literal: " + doubleLiteral); // Output: 3.14159
    }
}
