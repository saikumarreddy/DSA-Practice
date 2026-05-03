# DSA Practice

Daily Data Structures & Algorithms practice in Java — 2+ years of consistent problem solving.

## Stats

| Metric | Value |
|--------|-------|
| Practice streak | 2024-05-01 → present |
| Total days | 730+ |
| Total problems | 736+ |
| Languages | Java |
| Sources | LeetCode, NeetCode 150 |

## Structure

```
DSA-Practice/
├── daily/
│   └── YYYY-MM-DD/
│       ├── easy/       ← easy problems
│       └── medium/     ← medium / hard problems
├── topics/             ← best solutions organized by pattern
│   ├── arrays/
│   ├── strings/
│   ├── linked-lists/
│   ├── trees/
│   ├── graphs/
│   ├── dynamic-programming/
│   ├── binary-search/
│   ├── stack-queue/
│   ├── hashing/
│   ├── heap/
│   ├── backtracking/
│   └── greedy/
├── templates/          ← solution template
└── PROGRESS.md         ← log and stats
```

## Topics Covered

| Topic | Key Problems |
|-------|-------------|
| Arrays | Two Sum, Maximum Subarray, Trapping Rain Water, Spiral Matrix |
| Strings | Longest Substring, Minimum Window, Edit Distance, Decode String |
| Linked Lists | Reverse, Merge Sorted, Cycle Detection, Add Two Numbers |
| Trees | Level Order, Max Path Sum, Validate BST, Diameter |
| Graphs | Number of Islands, Course Schedule, Rotting Oranges, Word Ladder |
| Dynamic Programming | Coin Change, LIS, House Robber, Partition Equal Subset |
| Binary Search | Search in Rotated Array, Koko Bananas, Capacity to Ship |
| Stack / Queue | Min Stack, Daily Temperatures, Evaluate RPN, Asteroid Collision |
| Hashing | Group Anagrams, Top K Frequent, LRU Cache |
| Heap | Kth Largest, K Closest Points, Median Finder |
| Backtracking | Subsets, Permutations, Combination Sum, Generate Parentheses |
| Greedy | Jump Game, Merge Intervals, Non-overlapping Intervals |
| Two Pointers | Container With Most Water, 3Sum, Remove Nth Node |
| Sliding Window | Find All Anagrams, Longest Palindrome, Min Window Substring |

## Each Solution File

Every file follows this format:

```java
/**
 * Problem: <name>
 * Link:    <leetcode url>
 * Level:   Easy / Medium / Hard
 * Topic:   <topic tags>
 *
 * Approach: <plain-English explanation>
 * Time:  O(...)
 * Space: O(...)
 */
public class ProblemName {
    // solution method

    public static void main(String[] args) {
        // test cases with expected output in comments
    }
}
```

## Daily Workflow

1. Pick 1 problem (easy or medium/hard depending on the day)
2. Solve it from scratch — no hints first
3. Write the header comment: approach, time, space
4. Run the `main()` test cases
5. Copy into the matching `topics/` folder if it's a best-practice solution
6. Commit: `git commit -m "Practice (YYYY-MM-DD): ProblemName"`

## Problem Sources

- [LeetCode](https://leetcode.com)
- [NeetCode 150](https://neetcode.io/practice)
- [Blind 75](https://leetcode.com/discuss/general-discussion/460599/blind-75-leetcode-questions)
