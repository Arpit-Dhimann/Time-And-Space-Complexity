# Complexity Analysis in Java

Understanding how algorithms perform as input size ($n$) grows.

## 1. Core Concepts
Complexity analysis allows us to measure the efficiency of an algorithm regardless of the hardware it runs on.

* **Time Complexity:** Quantifies the amount of time taken by an algorithm as a function of the input length.
* **Space Complexity:** Quantifies the amount of memory (RAM) an algorithm acquires relative to the input size.

## 2. Asymptotic Notations
These are used to describe the limiting behavior of an algorithm:

1. **Big-O Notation $O(g(n))$:** Denotes the **Upper Bound** (Worst-case). It defines the maximum time an algorithm will take.
2. **Omega Notation $\Omega(g(n))$:** Denotes the **Lower Bound** (Best-case). It defines the minimum time an algorithm will take.
3. **Theta Notation $\Theta(g(n))$:** Denotes the **Average Bound**. It represents the average time a program takes.

## 3. Comparing Efficiency
The order of growth (from slowest to fastest):

$$O(n^n) > O(n!) > O(n^3) > O(n^2) > O(n \log n) > O(n \log(\log n)) > O(n) > O(\sqrt{n}) > O(\log n) > O(1)$$

> **Note:** A program with **less time complexity is more efficient**. The goal is always to move towards the right side of the spectrum (e.g., aiming for $O(1)$ or $O(\log n)$).

## 4. Examples

### Linear Time Complexity $O(n)$
If a loop runs $n$ times, it takes linear time.

```java
int a = 0;
for (int i = 1; i <= n; i++) {
    // Constant time O(1) inside a loop O(n)
    a = a + 1;
}
// Explanation: The loop runs 'n' times. 
// The inside operation (a = a + 1) is constant time O(1). 
// Total Complexity: n * O(1) = O(n).