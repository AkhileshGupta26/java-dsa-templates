package AdvancedBitmasking;

public class stateCompression {
/*

Definition -> State Compression means

Represent a large state using fewer bits without losing any information.
We're not changing the information.
We're only changing how it's stored.


Why Compress?
Suppose ->n = 20

Boolean array
boolean[] visited = new boolean[20];
takes 20 boolean values.

Instead
00010110101010010101
One integer stores the entire state.

Think of it like zipping a folder.
Folder
↓
ZIP File

Nothing disappears.
It just becomes compact.



The Complete Recognition Rule
Use state compression when both are true:

Rule 1
Each item has 2 possible states.
YES / NO
ON / OFF
USED / UNUSED
SELECTED / NOT SELECTED

Rule 2
The number of items is small.
Usually
n ≤ 20
Sometimes
n ≤ 25


Example 3 — N Queens

Suppose
N = 4
Current board

Q . . .
. . Q .
. . . .
. . . .

Do we need to store

4×4 board
No.
We only need

occupied columns
occupied diagonals
occupied anti-diagonals

Each is binary.

Each becomes a mask.

Instead of

char[][] board

we use

int colMask;
int diagMask;
int antiDiagMask;











*/    
    
}
