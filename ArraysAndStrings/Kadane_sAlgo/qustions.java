package ArraysAndStrings.Kadane_sAlgo;

public class qustions {
/*
Level 1: Classic Kadane
1. 53. Maximum Subarray ⭐⭐⭐⭐⭐

The original Kadane algorithm.

Learn:

Running sum
DP relation
Reset intuition

2. 918. Maximum Sum Circular Subarray ⭐⭐⭐⭐⭐

New trick:

Answer = max(
    normal Kadane,
    totalSum - minimumSubarray
)

Learn:

Maximum Kadane
Minimum Kadane
Circular arrays


3. 1749. Maximum Absolute Sum of Any Subarray ⭐⭐⭐⭐
Need
maxSubarray
and
minSubarray

Learn:
Max Kadane
Min Kadane together


🟡 Level 2: 2D Kadane
4. 363. Max Sum of Rectangle No Larger Than K ⭐⭐⭐⭐⭐
Very famous interview question.

Idea
Fix left column
Fix right column
↓
Compress rows
↓
Run Kadane/Prefix Sum

5. 85. Maximal Rectangle ⭐⭐⭐⭐⭐
Uses histogram.
Histogram internally uses Kadane-like thinking.

6. 221. Maximal Square ⭐⭐⭐⭐
DP version.
Good companion problem.


🟠 Level 3: Product Kadane
7. 152. Maximum Product Subarray ⭐⭐⭐⭐⭐

Very important.

Need

maxEndingHere

minEndingHere

because

negative × negative = positive



🔵 Level 4: DP Extension
8. 1186. Maximum Subarray Sum with One Deletion ⭐⭐⭐⭐⭐
Classic interview.
Need
Forward Kadane
Backward Kadane
9. 1191. K-Concatenation Maximum Sum ⭐⭐⭐⭐

Uses Kadane multiple times.

10. 2321. Maximum Score Of Spliced Array ⭐⭐⭐⭐⭐

Transform problem
↓
Difference array

↓
Kadane

Very popular trick.


🔴 Level 5: Hard
11. 689. Maximum Sum of 3 Non-Overlapping Subarrays ⭐⭐⭐⭐⭐

Not pure Kadane.
Great continuation.
12. 3410. Maximize Subarray Sum After Removing All Occurrences of One Element
Recent hard problem.
Kadane transformation.

🟣 Transform to Kadane
These don't mention Kadane directly.
13. 2272. Substring With Largest Variance ⭐⭐⭐⭐⭐
Transform
↓
Kadane on characters.

14. 978. Longest Turbulent Subarray
Kadane-style DP.
15. 376. Wiggle Subsequence
Kadane-like state transition.



















*/    
    
}
