package Functional_Interfaces;


import java.util.Scanner;

public class String_Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.println("\nUppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Length: " + str.length());
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse: " + reverse);
        if (str.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }
        int vowels = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
        }
        System.out.println("Vowels: " + vowels);
    }
}
