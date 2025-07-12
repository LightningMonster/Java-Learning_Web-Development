/*
4. String Sorting using compareTo()
🔸 Problem:
Given 3 strings: "banana", "apple", "mango"
Sort and print them in alphabetical order using compareTo().

*/
public class P4_String_Sorting_using_compareTo {
    public static void main(String[] args) {
        String[] s = {"mango", "banana", "apple"};
        String temp;
        for(int i = 0; i<3; i++){
            for(int j = i; j<3; j++){
                if(s[i].compareTo(s[j]) > 0){
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

        for(String fruit:s){
            System.out.print(" "+fruit);
        }
    }
}
