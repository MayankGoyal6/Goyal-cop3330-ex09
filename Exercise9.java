 
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 9
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;
import java.lang.Math; 

class Main {
  public static void main(String[] args) {
  
  Scanner scanner = new Scanner(System.in);

  System.out.println("What is the length of the ceiling? ");
  int length = scanner.nextInt();

  System.out.println("What is the width of the ceiling? ");
  int width = scanner.nextInt();

  final int gallonCoverage = 350;

  int cArea = (length*width);

  double gallons = cArea/((double)gallonCoverage);

  System.out.println("You will need to purchase " + Math.round(gallons) + " gallons of paint to cover " + cArea + " square feet.");
  }
}