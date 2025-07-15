// 8.3 Custom Exceptions

package src.com.core03.Java_Basics;

class AgeException extends Exception {
    AgeException(String msg){
        super(msg);
    }
}
public class P8_3_Custom_Exceptions {

    static void checkAge(int age) throws AgeException{
        if (age < 18)
            throw new AgeException("Underage not allowed");
    }
    public static void main(String[] args) {
        try{
            checkAge(16);
        } catch (AgeException e){
            System.out.println(e.getMessage());
        }
    }
}

