package LinkedList.Templets;

public class pointer_invariant {
/*

What is an Invariant?
An invariant is something that is always true during every iteration of your algorithm.

Think of it as a promise.



Example 1: Reverse Linked List (206)
Code:

ListNode prev = null;
ListNode curr = head;

while(curr != null){

    ListNode next = curr.next;

    curr.next = prev;

    prev = curr;

    curr = next;
}
Pointer Invariant
At the start of every iteration:
prev = head of the already reversed part
curr = head of the not-yet-reversed part

This is ALWAYS true.

Even after 100 iterations.
That's an invariant.


Before writing any Linked List code, I write this table:

| Pointer     | Invariant                       |
| ----------- | ------------------------------- |
| `prev`      | Head of reversed part           |
| `curr`      | Head of unprocessed part        |
| `tail`      | Last node of constructed answer |
| `slow`      | Middle candidate                |
| `fast`      | Travels twice as fast as slow   |
| `prevGroup` | Node before current group       |
| `groupNext` | First node after current group  |
| `dummy`     | Permanent node before head      |


//// next = saves the head of the remaining unreversed list   ////

There are only 7 surgeries.

                LINKED LIST SURGERY

                (Everything is built from these)

                     Traverse
                        |
     ------------------------------------------------
     |        |         |        |        |         |
  Reverse    Cut     Connect   Delete   Insert    Merge

Everything from Easy to Hard is just a combination of these.











































*/    
    
}
