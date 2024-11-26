package org.example;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result_add = calculator.add(a,b);
        int result_subtract = calculator.subtract(a,b);
        int result_multiply = calculator.multiplication(a,b);
        int result_division = calculator.Division(a,b);
        System.out.println("Addition: "+result_add);
        System.out.println("Subtraction: "+result_subtract);
        System.out.println("Multiplication: "+result_multiply);
        System.out.println("Division: "+result_division);
    }
}