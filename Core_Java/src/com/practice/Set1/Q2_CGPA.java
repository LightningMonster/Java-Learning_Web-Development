//CGPA = (Sum of Grade Points in all subjects) / (Number of subjects)

package src.com.practice.Set1;
import java.util.Scanner;
public class Q2_CGPA {

    // Function to convert marks to grade point
    public static int marksToGradePoint(int marks) {
        if (marks >= 91) return 10;
        else if (marks >= 81) return 9;
        else if (marks >= 71) return 8;
        else if (marks >= 61) return 7;
        else if (marks >= 51) return 6;
        else if (marks >= 41) return 5;
        else if (marks >= 33) return 4;
        else return 0; // fail or very low marks
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for 3 subjects
        System.out.print("Enter marks for Subject 1 (out of 100): ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2 (out of 100): ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3 (out of 100): ");
        int m3 = sc.nextInt();

        // Convert marks to grade points
        int gp1 = marksToGradePoint(m1);
        int gp2 = marksToGradePoint(m2);
        int gp3 = marksToGradePoint(m3);

        // Calculate CGPA
        double cgpa = (gp1 + gp2 + gp3) / 3.0;

        // Output
        System.out.println("Grade Points: " + gp1 + ", " + gp2 + ", " + gp3);
        System.out.printf("CGPA: %.2f\n", cgpa);

        sc.close();
    }
}

