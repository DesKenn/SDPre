/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.objective4lab2;
    import java.util.Scanner;
/**
 *
 * @author dez
 */
public class Objective4Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);


      

    //TODO prompt the user to get input for all of the above int variables.
    System.out.print("Pick a whole number.");
    int num1 = keyboard.nextInt();    
        System.out.print("Pick a second whole number.");
    int num2 = keyboard.nextInt();
        System.out.print("Pick a third whole number.");
    int num3 = keyboard.nextInt();
    //TODO prompt the user to get input for all of the above double variables.
    System.out.print("Pick a decimal number.");
    double dub1 = keyboard.nextInt();   
    System.out.print("Pick a second decimal number.");
    double dub2 = keyboard.nextInt();
        System.out.print("Pick a third decimal number.");
    double dub3 = keyboard.nextInt();
    //TODO print the three ints and their sum.
    int sum1= num1 + num2 + num3;
    System.out.println(sum1);
    //TODO print the three doubles and their sum.
    double sum2= dub1 + dub2 + dub3;
    System.out.println(sum2);
    }
    
}