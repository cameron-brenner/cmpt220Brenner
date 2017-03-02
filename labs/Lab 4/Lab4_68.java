/*
Lab4_68.java
Cameron Brenner
Software Dev 1
Lab 4
March 2, 2017
Lab 4 problem 6.8
*/

import java.util.*;

public class Lab4_68{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Celsius          Fahrenheit         |             Fahrenheit            Celsius\n");
    System.out.print("________________________________________________________________________________\n");     
    System.out.printf("40.0             "+CelsiusToFarenheit(40.0)+"              |             120.0                 %.2f\n",FahrenheitToCelsius(120.0));
    System.out.printf("39.0             "+CelsiusToFarenheit(39.0)+"              |             110.0                 %.2f\n",FahrenheitToCelsius(110.0));
    System.out.printf("...\n");
    System.out.printf("32.0             "+CelsiusToFarenheit(32.0)+"               |             40.0                  %.2f\n",FahrenheitToCelsius(40.0));
    System.out.printf("31.0             %.1f               |             30.0                  %.2f\n",CelsiusToFarenheit(31.0),FahrenheitToCelsius(30.0));
    
  
    
  }

  public static double CelsiusToFarenheit(double celsius){
    double fahrenheit = (9.0 / 5) * celsius + 32;
    return fahrenheit;
  }

  public static double FahrenheitToCelsius(double fahrenheit){
    double celsius = (5.0/9) * (fahrenheit - 32);
    return celsius;
  }
}          

