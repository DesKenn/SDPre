/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.objective4lab1;

/**
 *
 * @author dez
 */
import java.util.Scanner;

public class Objective4Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

  Scanner keyboard = new Scanner(System.in);
    System.out.println("What's your first name?");
    String fname = keyboard.nextLine();
    System.out.println("What's your last name?");
    String lname = keyboard.nextLine();
    System.out.println("What's your favorite animal?");
    String favoriteAnimal = keyboard.nextLine();
    System.out.println("What's your favorite food?");
    String favoriteFood = keyboard.nextLine();
    System.out.println("What's your favorite song?");
    String favoriteSong = keyboard.nextLine();    
    //output code
    System.out.println("My name is "+ fname + " " + lname + ".");
    System.out.println("My favorite animal is " + favoriteAnimal );
    System.out.println("My favorite food is " + favoriteFood + ".");
    System.out.println("My favorite song is " + favoriteSong + ".");
    }
    
}