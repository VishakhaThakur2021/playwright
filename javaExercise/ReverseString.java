package javaExercise;

import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a string: ");
    char[] letters = scanner.nextLine().toCharArray();
    System.out.print("Reverse string: ");
    for (int i = letters.length - 1; i >= 0; i--) {
      System.out.print(letters[i]);
    }
  }
}

