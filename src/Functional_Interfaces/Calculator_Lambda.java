package Functional_Interfaces;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
public class Calculator_Lambda {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;
        int a = 20;
        int b = 10;
        System.out.println("Addition: " + add.calculate(a, b));
        System.out.println("Subtraction: " + sub.calculate(a, b));
        System.out.println("Multiplication: " + mul.calculate(a, b));
        System.out.println("Division: " + div.calculate(a, b));
    }
}
