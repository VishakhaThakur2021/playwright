package javaExercise;

import java.util.Scanner;

//1.Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//2.Write a Java program that takes five numbers as input to calculate and print the average of the numbers.
public class Exercise {

  public static void main(String[] args) {
    System.out.println("Hello\nVishu");
    Scanner scanner = new Scanner(System.in);
    System.out.println("number1");
    int n1 = scanner.nextInt();
    System.out.println("number2");
    int n2 = scanner.nextInt();
    System.out.println("number3");
    int n3 = scanner.nextInt();
    System.out.println("number4");
    int n4 = scanner.nextInt();
    System.out.println("number5");
    int n5 = scanner.nextInt();
    System.out.println("Average of five numbers is: " +
        (n1 + n2 + n3 + n4 + n5) / 5);
  }


}
