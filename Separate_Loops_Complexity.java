// PROBLEM: Analyze the Time & Space Complexity of following code.

public class Separate_Loops_Complexity {
    public static void main(String[] args) {
        int n = 10;

        /* * TIME COMPLEXITY: O(n) 
         * EXPLANATION: 
         * Loop 1 runs O(n) times.
         * Loop 2 runs O(n) times.
         * Rule: Drop the constant (2), so it remains O(n).  
        
         # SPACE COMPLEXITY: O(1) - Constant Space
         - EXPLANATION: We are only using a few integer 
           variables (n, i, j).
         - The memory used does not grow with the input 
           size 'n'.   */

        // First Loop: O(n)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        // Second Loop: O(n)
        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }

        // Total Complexity: O(n + n) = O(2n). 
        // In Big O, we drop constants, so it becomes O(n).
        
    }
}