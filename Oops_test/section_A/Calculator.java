package section_A;
//Qns_3

//overloading
public class Calculator {
	public void add(int a,int b) {
		System.out.println("Add : "+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("Add : "+(a+b+c));
	}
	public void add(double a,double b) {
		System.out.println("Add : "+(a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calcs=new Calculator();
		calcs.add(2, 5);
		calcs.add(7, 7, 7);
		calcs.add(1002.5d, 1002.5d);
	}

}
