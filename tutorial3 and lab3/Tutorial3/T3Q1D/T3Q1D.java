package T3Q1D;

import java.util.Scanner;

public class T3Q1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two strings: ");
        String s1 = scanner.next();
        String s2 = scanner.next();
        
        if (s1.compareToIgnoreCase(s2) <= 0) {
            System.out.println(s1 + " " + s2);
        } else {
            System.out.println(s2 + " " + s1);
        }
        
        scanner.close();
    }
}
