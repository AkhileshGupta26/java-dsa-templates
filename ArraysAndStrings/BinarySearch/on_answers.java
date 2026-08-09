package ArraysAndStrings.BinarySearch;


public class on_answers {
/*
(1)
Universal Template (First True)
Use when the pattern is FFFTTT (we're looking for the minimum valid answer).

int s = minAnswer;
int e = maxAnswer;
int ans = e;

while (s <= e) {

    int m = s + (e - s) / 2;

    if (can(m)) {
        ans = m;
        e = m - 1;
    } else {
        s = m + 1;
    }
}

return ans;




(2)
Universal Template (Last True)
Use when the pattern is TTTFFF (we're looking for the maximum valid answer).

int s = minAnswer;
int e = maxAnswer;
int ans = s;

while (s <= e) {

    int m = s + (e - s) / 2;

    if (can(m)) {
        ans = m;
        s = m + 1;
    } else {
        e = m - 1;
    }
}

return ans;






######## IMPORTANT INSTRUCTIONS #######

TRY TO USE LONG INSTEAD OF INT on QUESTIONS ON BINARY SEARCH ON ANSWERS

//SPLITTING PROBLEMS -> DIVIDE IN K GROUP -> can be solved using binary search on answers

//PROBLEMS 

1. LeetCode 875 - Koko Eating Bananas
2. LeetCode 1283 - Find the Smallest Divisor Given a Threshold
3. LeetCode 1011 - Capacity to Ship Packages Within D Days
4. LeetCode 1482 - Minimum Number of Days to Make m Bouquets
5. LeetCode 1552 - Magnetic Force Between Two Balls (Aggressive Cows)
6. LeetCode 2226 - Maximum Candies Allocated to K Children
7. LeetCode 1760 - Minimum Limit of Balls in a Bag
8. LeetCode 2064 - Minimized Maximum of Products Distributed to Any Store
9. LeetCode 410 - Split Array Largest Sum
10. LeetCode 774 - Minimize Max Distance to Gas Station (advanced)

 















*/    
    
}
