//WAP to print user's name

import java.util.Scanner;

class UserName 
{
  public static void main(String[] args) 
 {
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter username : ");

    String userName = myObj.nextLine();
    System.out.println("Username is " + userName); 
  }
}