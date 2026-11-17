package Array_1_2_3Dimensational_Task;


import java.util.Scanner;

public class College_Management_3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] marks = new int[2][2][3];
        int overallHighest = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.println("\nDepartment " + (i + 1));
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("Class " + (j + 1));
                for (int k = 0; k < marks[i][j].length; k++) {
                    System.out.print("Student " + (k + 1) + " Mark: ");
                    marks[i][j][k] = sc.nextInt();
                }
            }
        }
        for (int i = 0; i < marks.length; i++) {
            int departmentHighest = 0;
            System.out.println("\nDepartment " + (i + 1));
            for (int j = 0; j < marks[i].length; j++) {
                int total = 0;
                System.out.println("\nClass " + (j + 1));
                for (int k = 0; k < marks[i][j].length; k++) {
                    int mark = marks[i][j][k];
                    System.out.println("Student " + (k + 1)+ ": " + mark);
                    total += mark;
                    if (mark > departmentHighest) {
                        departmentHighest = mark;
                    }

                    if (mark > overallHighest) {
                        overallHighest = mark;
                    }
                }
                double average = (double) total / marks[i][j].length;
                System.out.println("Class Total: " + total);
                System.out.println("Class Average: " + average);
            }
            System.out.println("\nDepartment Highest: "+ departmentHighest);
        }
        System.out.println("\nOverall Highest Mark: " + overallHighest);
    }
}

