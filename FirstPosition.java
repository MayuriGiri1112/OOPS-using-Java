//Using code 1 above or otherwise print first position where x occurs in two consecutive positions.

import java.util.Scanner;
import java.util.Random;
public class FirstPosition
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n; 
        System.out.print("Enter the length of array : ");
        n = sc.nextInt();
        int[] arr = new int[n]; 
        Random rand = new Random(); 
        for(int i = 0; i < n; i++) 
        {
            arr[i] = rand.nextInt(20) + 10; 
        }
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
            count++;
            if (count == 4) 
            {
                System.out.println();
                count = 0;
            }
        }
        System.out.println();

        //Search for x occurs in two consecutive positions
        int x;
        System.out.print("Enter the element to be searched : ");
        x = sc.nextInt();
        int pos = -1;
        for (int i = 0; i < n - 1; i++) 
       {
            if (arr[i] == x && arr[i + 1] == x) 
	  {
                pos = i; 
                break; 
            }
        }
        if (pos != -1) 
       {
            System.out.println("The first position where " + x + " occurs in two consecutive positions is " + pos);
        } 
	else 
	{
            System.out.println(x + " does not occur in two consecutive positions in the array");
        }

    }
}