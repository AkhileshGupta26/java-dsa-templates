package Heap;
import java.util.*;
public class pq {
    public static void main(String[] args) {
        // By default ->Min Heap
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        // For max heap
        PriorityQueue<Integer> pq2=new PriorityQueue<>(Collections.reverseOrder());

        PriorityQueue<int[]> pq3 = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> pq4 = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        /*
        Java doesn’t know how to compare int[]

It has no natural ordering
So this is invalid / unsafe
        */
          /*

          Now YOU define:
how elements are compared
which one is “bigger” or “smaller” */

        PriorityQueue<int[]> pq5 = new PriorityQueue<>(
    (a, b) -> {
        if (a[0] == b[0]) return b[1] - a[1];
        return b[0] - a[0];
    }
);
        /*

        | Function    | Meaning      |
| ----------- | ------------ |
| `add()`     | insert       |
| `offer()`   | safer insert |
| `peek()`    | top element  |
| `poll()`    | remove top   |
| `size()`    | current size |
| `isEmpty()` | check empty  |

###### HEAP IS NOT FULLY SORTED ,TOP ELEMENT IS GURANTEED ONLY


         */

        /*
        class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < arr.length; i++) {
            pq.offer(arr[i]);
            
            if (pq.size() > k) {
                pq.poll(); // remove smallest
            }
        }
        
        while (pq.size() > 0) {
            ans.add(pq.poll());
        }
        
        Collections.sort(ans, Collections.reverseOrder()); // key fix
        
        return ans;
    }
}
        */
                 


    }
    
}
