package condition_Task;

import java.util.Scanner;

public class Largest_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the value 1: ");
		int value1=in.nextInt();
		System.out.print("Enter the value 2:");
		int value2=in.nextInt();
		
		if(value1>value2) {
			System.out.println(value1+" is a Largest number..");
		}
		else if(value2>value1) {
			System.out.println(value2+" is a largest number..");
		}
		else if(value1==value2) {
			System.out.println("Both numbers are Equal..");
		}
		else {
			System.out.println("Invalid Number..");
		}
	}

}
