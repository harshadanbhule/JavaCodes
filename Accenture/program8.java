/*
 Certainly! Here is a clear problem statement for the provided code:

### Problem Statement:

You are given two strings, `s` and `t`. The goal is to determine how many characters from the string `s` can be found in the string `t` in the same order. 

Specifically, you need to:

1. **Match Characters in Order**:
   - Traverse through the characters of `t`.
   - Try to match them with the characters of `s` in the same order as they appear in `s`.

2. **Count Matches**:
   - Count how many characters from `s` can be sequentially matched in `t` as per the order in `s`.

3. **Return the Count**:
   - Return the total number of characters from `s` that were matched in `t` in the correct sequence.

### Input:

- **String `s`**: The string containing characters to be matched.
- **String `t`**: The string in which the characters from `s` need to be matched.

Both strings consist of lowercase English letters only.

### Output:

- An integer representing the number of characters from `s` that can be found in `t` in the same order.

### Example:

**Input:**
```
s = "abc"
t = "aabbcc"
```

**Output:**
```
3
```

**Explanation:**
- The characters `'a'`, `'b'`, and `'c'` from `s` appear in `t` in the same order. Thus, all 3 characters are matched.

### Constraints:

- The length of `s` and `t` can be up to \(10^5\) characters.

### Notes:

- If `s` is an empty string, the output should be `1` because an empty string can be matched trivially.
- If `t` is an empty string, the output should be `0` since no characters from `s` can be matched in `t`.

This problem tests your ability to process strings and match characters in a specific sequence efficiently.*/


import java.util.Scanner;

public class ColorfulStones {

    // Method to solve the problem
    public static int solve(String s, String t) {
        int n = s.length();
        int idx = 0;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(idx)) {
                idx++;
            }
        }

        return idx + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();  // Read string s
        String t = sc.next();  // Read string t

        // Call solve method and print the result
        System.out.println(solve(s, t));
    }
}

