// Problem: Analyze the Time & Space Complexity of following code.

public class Quadratic_Complexity {
    public static void main(String[] args) {
        int n = 5;
        /*
         # TIME COMPLEXITY ANALYSIS:
         - TIME COMPLEXITY: O(n^2) - Quadratic
         - EXPLANATION: For every iteration of the outer loop, the inner loop runs
           'n' times.
         - Total operations = n * n = n^2.   
         
         # SPACE COMPLEXITY ANALYSIS:
         - SPACE COMPLEXITY: O(1) - Constant Space
         - EXPLANATION: We are only using a few primitive integer variables 
           (n, i, j) which take fixed memory, regardless of how large 'n' is.   */

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}