package java_task_operator;

import java.util.Scanner;

public class Student_Marks_Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the mark (out of 100): ");
		int mark=in.nextInt();
		if(mark<=100) {
			double percent=((double) mark / 100) * 100;
			System.out.println("percentage of mark is : "+percent+"%");
		}
		else {
			System.out.println("Invalid input mark");
		}
	}
}
