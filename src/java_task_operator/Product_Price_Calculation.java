package java_task_operator;

public class Product_Price_Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double product_cost=999.50d;
		int buy_product=3;
		int discount=10;
		double amount=product_cost*buy_product;
		double final_price=(((double)amount)/100)*discount;
		System.out.println("discount amount: "+final_price);
		System.out.println("Final amount: "+(amount-=final_price));
	}
}
