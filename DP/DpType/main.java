package DP.DpType;

public class main {
/*

| Problem Type            | Question Asked                             | Current Contribution | Combine Children    | Generic Recurrence                                                                                  |    |           |   |           |
| ------------------------| ------------------------------------------ | -------------------- | ------------------- | --------------------------------------------------------------------------------------------------- | -- | --------- | - | --------- |
| 🟢 Count Ways          | How many ways?                             | `0`                  | `+`                 | `solve(a) + solve(b)`                                                                               |    |           |   |           |
| 🟢 Count Ways (curr=1) | Count paths/subsequences including current | `1`                  | `+`                 | `1 + solve(...)` *(only if current itself contributes one object, e.g. Number of Increasing Paths)* |    |           |   |           |
| 🔵 Minimum Cost        | Minimum cost/sum                           | `cost`               | `min()`             | `cost + min(...)`                                                                                   |    |           |   |           |
| 🟣 Maximum Score       | Maximum score/profit                       | `reward`             | `max()`             | `reward + max(...)`                                                                                 |    |           |   |           |
| 🟡 Minimum Steps       | Minimum operations/jumps/coins             | `1`                  | `min()`             | `1 + min(...)`                                                                                      |    |           |   |           |
| 🟠 Maximum Length      | Longest path/LIS/LCS                       | `1`                  | `max()`             | `1 + max(...)`                                                                                      |    |           |   |           |
| ⚫ Decision            | Can it be done?                            | `-`                  | `OR (               |                                                                                                     | )` | `solve(a) |   | solve(b)` |
| ⚪ Validation          | Must all satisfy?                          | `-`                  | `AND (&&)`          | `solve(a) && solve(b)`                                                                              |    |           |   |           |
| 🔴 Probability         | Probability/Expectation                    | Depends              | Formula             | Depends on transition                                                                               |    |           |   |           |
| ⭐ Reverse DP          | Minimum resource to survive                | Modify requirement   | `min()` then adjust | `max(1, min(next) - current)`                                                                       |    |           |   |           |



































*/    
    
}
