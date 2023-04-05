//WAP to add two numbers

import java.io.*;
import java.util.Scanner;

public class Sum 
{
  public static void main(String[] args) 
{
  	int num1, num2, sum;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number 1 : ");
    num1 = s.nextInt();
    System.out.print("Enter number 2 : ");
    num2 = s.nextInt();
    sum = num1+num2;
    System.out.print("Sum of "+num1+" and "+num2+" is "+sum);
  }
}