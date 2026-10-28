package java_task_operator;

import java.util.Scanner;

public class Assignment_task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number 1: ");
		int a=in.nextInt();//5
		System.out.println("Enter the number 2: ");
		int b=in.nextInt();//2
		
		System.out.println("Addition : "+(a+=b)); //a=5+2==>7
		System.out.println("Subtraction : "+(a-=b));//a=7-2==>5
		System.out.println("Multiply : "+(a*=b));//a=5*2==>10
		System.out.println("Division : "+(a/=b));//a=10/2==>5
	}

}
