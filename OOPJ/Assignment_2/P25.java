class P25 {
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;
        
        while (n != 0) {
            rev = rev * 10 + n % 10; // Extract last digit and add to rev
            n /= 10; // Remove last digit
        }
        
        System.out.println("Reversed Number: " + rev);
    }
}