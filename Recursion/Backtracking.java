package Recursion;

public class Backtracking {
/*
                    RECURSION
                         │
      ┌──────────────────┴──────────────────┐
      │                                     │
 Simple Recursion                   Backtracking
      │                                     │
      │                          ┌──────────┴───────────┐
      │                          │                      │
  Divide & Conquer          Decision               Assignment


   Template 3: Loop + Recursion (Choose → Recurse → Undo)

   void solve(...) {

    // Base Case

    for(each possible choice){

        // Choose

        solve(...);

        // Undo
    }
}

Why This Pattern Is Different

(1)In Take/Not Take:

Current Element
      |
   ---------
   |       |
 Take    Skip

There are exactly 2 choices.

(2)In Loop + Recursion:

Current Position

      |
-----------------------
|    |    |    |    |
1    2    3    4   ...

You can choose any valid option.

The branching factor is no longer fixed at 2.
   

















*/    
    
}
