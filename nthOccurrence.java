//Print position of nth occurence of x.

import java.util.Scanner;
import java.util.Random;
public class nthOccurrence
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

        // find the position of the nth occurrence of x
        int x;
        int nth;
        System.out.print("Enter the element to be searched : ");
        x = sc.nextInt();
        System.out.print("Enter the nth : ");
        nth = sc.nextInt();
        int c = 0; 
        int pos = -1; 
        for (int i = 0; i < n; i++) 
       {
            if (arr[i] == x) 
            {
                c++; 
                if (c == nth) 
                {
                    pos = i; 
                    break;
                }
            }
        }
        if (pos != -1) 
        {
            System.out.println("The position of the " + nth + "-th occurrence of " + x + " is " + pos);
        } 
        else 
        {
            System.out.println("The " + nth + "-th occurrence of " + x + " was not found in the array");
        }

    }
}
