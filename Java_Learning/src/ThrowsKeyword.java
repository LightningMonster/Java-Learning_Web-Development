public class ThrowsKeyword {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;

        try {
            c = divide(a, b);  
        } catch (ArithmeticException e) {
            c = 1;
            System.out.println("Something went wrong");
        } catch (Exception e) {
            c = 1;
            System.out.println("Something went wrong");
        }

        System.out.println("Result: " + c);
    }

    // Method uses 'throws'
    public static int divide(int x, int y) throws ArithmeticException {
        return x / y;
    }
}
