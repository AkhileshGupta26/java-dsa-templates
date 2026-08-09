package BitManipulation;

public class bitAsDS {
/*


| Original Data Structure          | Bit Representation |
| -------------------------------- | ------------------ |
| `HashSet`                        | Bitmask            |
| `boolean[]`                      | Bitmask            |
| Multiple booleans                | Flag bits          |
| `visited[]`                      | Mask               |
| `selected[]`                     | Mask               |
| `used[]`                         | Mask               |
| `occupied[]`                     | Mask               |
| `HashSet<Character>`             | 26-bit mask        |
| `HashSet<Integer>` (small range) | Bitmask            |
| Chess board                      | Bitboard           |



2. Faster Operations ⭐⭐⭐⭐⭐

Instead of ->set.contains(x)
Use -> (mask & (1 << x))



4. State Compression ⭐⭐⭐⭐⭐
Compress -> boolean used[]
into -> mask


5. Dynamic Programming ⭐⭐⭐⭐⭐

Probably the biggest use in interviews.
Examples

dp[mask]

Subset DP

dp[node][mask]




6. Graph Algorithms ⭐⭐⭐⭐⭐
Instead of -> (node, visited[])
Use  -> (node, mask)



7. Character Problems ⭐⭐⭐⭐⭐

Store characters inside one integer.

Applications

Duplicate characters
Common characters
Unique characters

Problems

LC318
LC1239
LC1178














*/    
    
}
