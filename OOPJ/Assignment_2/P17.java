class P17 {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 7, d = 3;

        int min = (a < b) ? ((a < c) ? ((a < d) ? a : d) : (c < d) ? c : d)
                          : ((b < c) ? ((b < d) ? b : d) : (c < d) ? c : d);

        System.out.println("Minimum value is: " + min);
    }
}