/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.objective5lab2;

/**
 *
 * @author dez
 */
public class Objective5Lab2 {
  public static void main(String[] args) {

   String string1 = "Banana";
    String string2 = "Bacon";
    String string3 = "Banana";

    if(string1.equals(string2)) {
      System.out.println(string1 + " is equivalent to " + string2);
    }
    else {
      System.out.println(string1 + " is not equivalent to " + string2);
    }

    if(string2.equals(string3)){
       System.out.println(string2 + " is equivalent to " + string3);
    }
    else{
       System.out.println(string2 + " is equivalent to " + string3); 
    }
    if(string1.equals(string3)){
      System.out.println(string1 + " is equivalent to " + string3);
    }
    else{
    System.out.println(string1 + " is equivalent to " + string3);
  
    }
  }
}