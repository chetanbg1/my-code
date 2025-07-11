# my-code

Time Complexity
Measures how fast an algorithm runs as input grows.

Expressed in Big O notation.

Common Complexities:
Complexity	                             Meaning                                          	Example
O(1)	                                  Constant time	                                      Access array element
O(n)	                                  Linear	                                            Single loop through array
O(log n)	                              Logarithmic	                                        Binary search
O(n log n)	                            Linearithmic	                                      Merge sort, Quick sort
O(n²)                                  	Quadratic	                                          Nested loops
O(2ⁿ), O(n!)	                          Exponential, Factorial	                            Recursion, Permutations

🔷 Space Complexity
Measures memory used as input grows.

Includes input, variables, and data structures used.

Examples:
Using just a counter → O(1)

Using a new array of size n → O(n)

🔷 Asymptotic Notations
Used to describe complexity behavior as input size grows:

Notation	Represents	Meaning
O(f(n))	Big O	Upper bound (Worst-case)
Ω(f(n))	Omega	Lower bound (Best-case)
Θ(f(n))	Theta	Tight bound (Average/exact)

Relationship:
scss

Ω(f(n)) ≤ Θ(f(n)) ≤ O(f(n))
💡 Key Takeaways
Always aim for optimal time and space solutions.

In interviews, default to using Big O notation.

Focus on problem-solving patterns like:

Sliding window, Hashing, Recursion, DP, etc.

