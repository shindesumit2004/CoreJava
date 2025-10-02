package assignment;

public class method {
    public static class Example {

        // Method to add two numbers
        int add(int a, int b) {
            return a + b;
        }

        public static void main(String[] args) {
            Example obj = new Example();
            int result = obj.add(10, 20);  // Calling the method
            System.out.println("Sum: " + result);
        }
    }

}
