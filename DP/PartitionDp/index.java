package DP.PartitionDp;

public class index {
/*


Universal Picture

                [L........R]

            Split at every possible K

        L..K                 K+1..R

        solve()              solve()

                 Combine






The Core Idea

Suppose I give you

A B C D E

Instead of asking

Should I take B?
We ask
Where should I split the interval?

Example

ABCDE

Possible partitions

A | BCDE

AB | CDE

ABC | DE

ABCD | E

Every partition is a candidate answer.                 




*** The Four Questions *****

Every Partition DP problem can be solved by answering four questions.

Question 1
What is my interval?
Usually
(left,right)


Question 2
Where can I partition?
Usually
for(k=left;k<right;k++)


Question 3
What are the left and right subproblems?
solve(left,k)
solve(k+1,right)


Question 4
How do I combine?
This depends on the problem.


The Independence Rule ⭐⭐⭐⭐⭐
This is the most important sentence in Interval DP.
After making a partition, the left and right intervals become independent subproblems










*/    
    
}
