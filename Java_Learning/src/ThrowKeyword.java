public class ThrowKeyword {

    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 0;

        try {
            c = a / b;

            // Using 'throw' to manually raise an exception if result is 2
            if (c == 2) {
                throw new ArithmeticException("Manually thrown exception: result is 2");
            }

        } catch (ArithmeticException e) {
            c = 1;
            System.out.println("Something went wrong: " + e.getMessage());
        } catch (Exception e) {
            c = 1;
            System.out.println("General error: " + e.getMessage());
        }

        System.out.println("Result: " + c);
    }
}
