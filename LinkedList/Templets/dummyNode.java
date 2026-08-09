package LinkedList.Templets;

public class dummyNode {

/*


The Problem Dummy Node Solves

Suppose:
head → 6 → 2 → 3
Need to delete 6.
Problem:
head itself changes
That creates edge cases.


Solution: Add a fake node
Instead of starting here:
head → 6 → 2 → 3
Create:
dummy → 6 → 2 → 3
          ↑
         head


ListNode dummy = new ListNode(-1);
dummy.next = head;

ListNode curr = dummy;



class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode temp = dummy;

        while (temp.next != null) {

            if (temp.next.val == val) {
                temp.next = temp.next.next;   // remove node
            } else {
                temp = temp.next;             // move ahead
            }
        }

        return dummy.next;
    }
}



















*/    


    
}
