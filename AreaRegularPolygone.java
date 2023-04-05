//WAP to find area of regular polygon. Given number of sides n and length of each sides l


import java.util.Scanner;

public class AreaRegularPolygon 
{
   public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the number of sides: ");
      int n = input.nextInt();

      System.out.print("Enter the length of each side: ");
      double s = input.nextDouble();

      A = (n * s^2) / (4 * tan(pi/n))
      double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

      System.out.println("The area of the regular polygon is " + area);
   }
}
