package section_A;

//Qns_4 

class Parent{
	public void Display() {
		System.out.println(" Parent Class Display ");
	}
}
class Child extends Parent{
	@Override
	public void Display() {
		System.out.println(" Child Class Display ");
	}
}
public class MethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child=new Child();
		child.Display();
	}

}
