//Using above code or otherwise search element x in above and print position of first occurence.

import java.util.Scanner;
import java.util.Random;
public class SearchElementRandomNumberArray
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
            arr[i] = rand.nextInt(90) + 10; 
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

        //Search
        int x; 
        System.out.print("Enter the element to be searched : ");
        x = sc.nextInt();
        int pos = -1;
        for (int i = 0; i < n; i++) 
       {
            if (arr[i] == x) 
           {
                pos = i;
                break;
            }
        }
        if (pos != -1) 
        {
            System.out.println("The first occurrence of " + x + " is at position " + pos);
        } 
        else 
        {
            System.out.println(x + " is not found in the array");
        }
    }
}
