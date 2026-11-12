package L3Q1;

import java.util.Scanner;

public class L3Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter two integer number: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the operand: ");
        char operand = scanner.next().charAt(0);
        
        if (operand == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (operand == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (operand == '*') {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (operand == '/') {
            if (num2 != 0) {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            } else {
                System.out.println("Cannot divide by zero");
            }
        } else if (operand == '%') {
            if (num2 != 0) {
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
            } else {
                System.out.println("Cannot divide by zero");
            }
        } else {
            System.out.println("Invalid operand");
        }
        
        scanner.close();
    }
}
