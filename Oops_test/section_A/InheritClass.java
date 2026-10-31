package section_A;
//Qns_2
class Vehicle{
	public void Start() {
		System.out.println(" Vehicle started.... ");
	}
}
//inheritance
class Car extends Vehicle{
	public void Drive( ) {
		System.out.println(" Car is driving..... ");
	}
}
public class InheritClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.Start();
		car.Drive();		
	}

}
