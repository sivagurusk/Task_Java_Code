package Array_1_2_3Dimensational_Task;


import java.util.Scanner;

public class Student_marks_1D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[10];

        int highest = 0;
        int lowest = 100;

        int pass = 0;
        int fail = 0;
        int total = 0;
        for (int i = 0; i < marks.length; i++) {

            System.out.print("Enter student " + (i + 1) + " mark: ");
            marks[i] = sc.nextInt();

            total += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }

            if (marks[i] >= 35) {
                pass++;
            } else {
                fail++;
            }
        }

        System.out.println("\nStudent Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        double average = (double) total / marks.length;

        System.out.println("\nHighest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);
        System.out.println("Average: " + average);
        System.out.println("Passed Students: " + pass);
        System.out.println("Failed Students: " + fail);

    }
}
