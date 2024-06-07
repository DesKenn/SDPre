/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.objective5lab3;
import java.util.Scanner;
/**
 *
 * @author dez
 */
public class Objective5Lab3 {

    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
      int userNum;

      System.out.println("Please enter a number: ");
      userNum = scanner.nextInt();
     if(userNum > 0){
     System.out.println(userNum + " is greater than 0");    
     }
     else if (userNum < 0){
         System.out.println(userNum + " is less than 0");    
    }
     else if(userNum == 0){
         System.out.println(userNum + " is equal to 0");    
     }
      scanner.close();
    }
}
