import java.util.*;
import java.lang.*;

class GFG {
    static void majority_number(int arr[], int N)
    {
        int maxCount = 0;
        int index = -1;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        if (maxCount > N / 2)
            System.out.println(arr[index]);
 
        else
            System.out.println("No Majority Element");
    }
 
    public static void main(String[] args)
    {        
        int N = arr.length;
        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        findMajority(arr, N);
    }
}