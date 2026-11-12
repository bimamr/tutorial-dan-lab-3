package T3Q1C;

import java.util.Scanner;

public class T3Q1C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is a capital letter");
        } else {
            System.out.println(ch + " is not a capital letter");
        }
        
        scanner.close();
    }
}
