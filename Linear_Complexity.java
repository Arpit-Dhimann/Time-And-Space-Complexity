// PROBLEM: Analyze the Time & Space complexity of following code.

import java.util.*;

public class Linear_Complexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter (n) : ");
        // Input 'n' defines the number of times the loop will run
        int n = sc.nextInt();
        
        // Simple for loop to print numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            
        /*
         # TIME COMPLEXITY ANALYSIS:
         - TIME COMPLEXITY: O(n) - Linear
         - EXPLANATION: The loop iterates 'n' times. 
         - If 'n' doubles, the execution time also doubles. 
         - Result: Time Complexity is O(n) - Linear Time.

         # SPACE COMPLEXITY ANALYSIS:
         - Space Complexity: O(1) - Constant
         - Explanation: We are only using fixed variables (n, i), 
           no extra data structure (like arrays) is used.   */
           
           System.out.println(i +" TIME COMPLEXITY ");
            
        }

        sc.close();
    }
}