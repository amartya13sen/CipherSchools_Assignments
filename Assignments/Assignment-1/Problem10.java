import java.util.*;
import java.lang.*;

class Problem10
{
    public static int maxWater(int[] arr, int n) 
    {
        int returnResult = 0;
        for(int i = 1; i < n - 1; i++)
        {
            int left = arr[i];
            for(int j = 0; j < i; j++)
            {
                left = Math.max(left, arr[j]);
            }
            int right = arr[i];
            for(int j = i + 1; j < n; j++)
            {
                right = Math.max(right, arr[j]);
            }
            returnResult += Math.min(left, right) - arr[i];
        }
        return returnResult;
    }
     
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        System.out.print(maxWater(arr,n));
    }
    }
     