class P23 {
    public static void main(String[] args) {
        int num = 5;

        String result = (num & 1) == 0 ? "Even" : "Odd";
        System.out.println(num + " is " + result);
    }
}