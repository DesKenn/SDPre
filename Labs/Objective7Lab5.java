/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.objective7lab5;
import java.util.Scanner;
/**
 *
 * @author dez
 */
public class Objective7Lab5 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();
      
        if (selection == 1) {
        System.out.println("Hello World");
      } else if (selection == 2) {
        System.out.println("My favorite foods: Apple, Banana, Coconut");
      } else if (selection == 3) {
        break; 
      } else {
        System.out.println("Invalid selection. Please choose 1, 2, or 3.");
      }
    }

    scanner.close();
      
    }

  }
  
