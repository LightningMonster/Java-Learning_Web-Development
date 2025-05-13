public class TryCatch {

    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 0;

        try {
            c = a / b;
        } catch (ArithmeticException e) {
            c = 1;
            System.out.println("Something went wrong");
        }
        catch (Exception e) {
            c = 1;
            System.out.println("Something went wrong");
        }

        System.out.println("Result: " + c);
    }
}
