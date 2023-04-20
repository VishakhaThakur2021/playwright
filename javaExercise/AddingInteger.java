package javaExercise;
//Write a Java program to print the sum of two numbers.
//Write a Java program to divide two numbers and print on the screen

import java.util.Scanner;

public class AddingInteger {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input the first number: ");
    int n1 = input.nextInt();
    System.out.print("Input the second number: ");
    int n2 = input.nextInt();
    int sum = n1 + n2;
    int minus = n1 - n2;
    int multiply = n1 * n2;
    int subtract = n1 + n2;
    int divide = n1 / n2;
    int modulo = n1 % n2;
    System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ", sum, minus, multiply, subtract, divide, modulo);
  }
}

