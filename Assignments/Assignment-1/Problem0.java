import java.util.*;
import java.lang.*; 
  
class Problem0 
{ 
    static void swap_numbers(int a, int b) 
    { 
        int temp = a; 
        a = b; 
        b = temp; 
    } 

    static boolean meet_each_other(int x1, int x2, int v1, int v2) 
    { 
        if (x1 < x2 && v1 <= v2) 
            return false; 
        if (x1 > x2 && v1 >= v2) 
            return false;   
        if (x1 < x2) 
        { 
            swap_numbers(x1, x2); 
            swap_numbers(v1, v2); 
        }  
       
        while (x1 >= x2)  
        { 
            if (x1 == x2)  
                return true;  
            x1 += v1;   
            x2 += v2;  
        } 
      
        return false;  
    } 
 
    public static void main (String[] args)  
    { 
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(); 
        int x2 = sc.nextInt(); 
        int v1 = sc.nextInt(); 
        int v2 = sc.nextInt(); 
        if (meet_each_other(x1, x2, v1, v2)) 
            System.out.println("Yes");  
        else
            System.out.println("No"); 
    } 
} 