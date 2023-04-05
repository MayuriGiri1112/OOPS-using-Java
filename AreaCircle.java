//WAP to find area of circle

import java.io.*;
import java.util.Scanner;

public class AreaCircle 
{
  public static void main(String[] args) 
 {
    double pi=3.14;
    double radius, area;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter radius : ");
    radius = s.nextDouble();
    area = pi * radius * radius;
    System.out.print("Area of circle is "+area);
  }
}