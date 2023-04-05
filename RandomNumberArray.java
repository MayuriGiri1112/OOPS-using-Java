//WAP to initialize an array of integers of size n by two-digit random numbers then print the elements as 4 elements in one row (len in last row, if necessary).

import java.util.Scanner;
import java.util.Random;
public class RandomNumberArray
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
    }
}