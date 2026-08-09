package DP.LIS;

public class lis_optimal {
/*

public int solve(int[] nums) {

    List<Integer> list = new ArrayList<>();

    for (int a : nums) {

        int s = 0;
        int e = list.size();

        while (s < e) {

            int mid = s + (e - s) / 2;

            if (a > list.get(mid)) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }

        if (s == list.size()) {
            list.add(a);
        } else {
            list.set(s, a);
        }
    }

    return list.size();
}



##### EXAMPLE #####

nums = [3,5,6,2,5,4,19,5,6,7,12]

find first val in list whose val >= nums[i] ,and replace it
if no one append to list

s-1 val=3 [3]
s-2 val=5 [3,5]
s-3 val=6 [3,5,6]
s-4 val=2 3>2 [2,5,6]
s-5 val=5 [2,5,6]
s-6 val=4 5>4 [2,4,6]
s-6 val=19 [2,4,6,19]
s-7 val=5  5>4[2,4,5,19]
s-8 val=6  19>6[2,3,5,6]
s-9 val=7  [2,3,5,6,7]
s-10 val=12 [2,3,5,6,7,12]

length of lis =size of list





















*/    
    
}
