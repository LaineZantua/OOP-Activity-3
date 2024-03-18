package Zantua_OOPActivity_3;

import java.util.Scanner;

public class Zantua_OOPActivity_3 {

    public static void main(String[] args) {
       Scanner scn = new Scanner (System.in);
       
        System.out.println("Fahrenehit: ");
        double fahrenheit = scn.nextDouble();
        
        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree of Fahrenheit is equal to " +
                celsius + " in Celsius.");
          
    } 
}
