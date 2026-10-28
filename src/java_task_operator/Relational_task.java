package java_task_operator;

import java.util.Scanner;

public class Relational_task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number 1: ");
		int a=in.nextInt();
		System.out.println("Enter the number 2: ");
		int b=in.nextInt();
		
		System.out.println("Equal : "+(a==b));
		System.out.println("Greater : "+(a>b));
		System.out.println("Smaller : "+(a<b));
	}

}
