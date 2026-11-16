
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("     STUDENT GRADING SYSTEM");
        System.out.println("=================================");

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter student name: ");
            String name = sc.next();

            int[] marks = new int[5];
            int total = 0;

            System.out.println("Enter marks for 5 subjects:");

            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();

                // Validate marks
                while (marks[j] < 0 || marks[j] > 100) {
                    System.out.println("Invalid mark! Enter a mark between 0 and 100.");
                    System.out.print("Subject " + (j + 1) + ": ");
                    marks[j] = sc.nextInt();
                }

                total += marks[j];
            }

            double average = total / 5.0;

            char grade;

            if (average >= 90) {
                grade = 'A';
            } else if (average >= 80) {
                grade = 'B';
            } else if (average >= 70) {
                grade = 'C';
            } else if (average >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            String status;

            if (average >= 50) {
                status = "PASS";
            } else {
                status = "FAIL";
            }

            System.out.println("\n========== STUDENT RESULT ==========");
            System.out.println("Student Name: " + name);
            System.out.println("Total Marks: " + total);
            System.out.println("Average: " + average);
            System.out.println("Grade: " + grade);
            System.out.println("Status: " + status);
            System.out.println("====================================");
        }

        System.out.println("\nThank you for using the Student Grading System!");

        sc.close();
    }
}
