package Stack;

public class MonotonicStack {
/*

Most people think:
"Stack stores previous elements."

❌ Wrong.
A Monotonic Stack stores only the useful previous elements.



Whenever you see questions like:
Next Greater Element
Previous Greater Element
Next Smaller Element
Previous Smaller Element
First taller building
Warmer day
Stock span
Histogram
Visibility

"Am I searching for the nearest element that satisfies a condition?"



Deque<Integer> dq = new ArrayDeque<>();

for (int x : nums) {

    while (!dq.isEmpty() && dq.peek() <= x) {
        dq.pop();
    }

    // dq.peek() is now the nearest greater candidate (if it exists)

    dq.push(x);
}




//core templet::::::::

while (!dq.isEmpty() && useless) {
    dq.pop();
}

dq.push(current);



Template 1 only pushed.
Template 2 has a while loop before the push.


Problems Covered
Start with these in order:
Easy
Next Greater Element I

Medium
Daily Temperatures
Online Stock Span

Medium/Hard
Next Greater Element II




















*/    
    
}
