public class Java_Exception {
    public static void main(String[] args) {
        try {
            checkAge(20);
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
        } finally {
            System.out.println("try and catch block has been executed...");
        }
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
