/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.objective5lab4;
import java.util.Scanner;
/**
 *
 * @author dez
 */
public class Objective5Lab4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNum;
        
        System.out.println("Pick a number: ");
        userNum = input.nextInt();
        
        if (userNum % 2 == 0 ){
        System.out.println(userNum + " is even.");
        }
        else if (userNum % 2 != 0){
        System.out.println(userNum + " is odd.");
                
                }

        }  
    }

