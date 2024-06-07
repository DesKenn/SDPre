/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.objective4lab3;

/**
 *
 * @author dez
 */

import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
      
    int birthYear, age, currentYear = 2024;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
     age = input.nextInt();
     
     birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
