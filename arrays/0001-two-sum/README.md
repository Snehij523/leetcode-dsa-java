# Two Sum — LeetCode #1

[View Problem on LeetCode](https://leetcode.com/problems/two-sum/)

- **Difficulty:** Easy
- **Topics:** Array, HashMap, Sorting, Two Pointers
- **Language:** Java

## Problem Statement

Given an integer array `nums` and an integer `target`, return the indices of two distinct elements whose sum equals the target.

Assume exactly one valid answer exists. You cannot use the same element twice.

## Example

**Input**
```text
nums = [2, 7, 11, 15]
target = 9
```

**Output**
```text
[0, 1]
```

**Explanation:** `nums[0] + nums[1] = 2 + 7 = 9`.

## Approach 1: Brute Force

Check every possible pair using nested loops. Return the indices when their sum matches the target.

- Time: O(n²)
- Extra space: O(1)
- Java file: `BruteForce.java`

## Approach 2: Sorting + Two Pointers

Sort an array of indices according to their corresponding values. Move two pointers inward based on whether the sum is smaller or larger than the target.

Preserving the original indices is essential because the problem asks for indices, not sorted positions.

- Time: O(n log n)
- Extra space: O(n)
- Java file: `SortingTwoPointers.java`

## Approach 3: HashMap

For each number, calculate `need = target - nums[i]`. If `need` is already in the map, return the stored index and the current index. Otherwise, store the current number and its index.

- Time: O(n) average
- Extra space: O(n)
- Java file: `HashMapApproach.java`

## Approach Comparison

| Approach | Time Complexity | Extra Space |
|---|---|---|
| Brute Force | O(n²) | O(1) |
| Sorting + Two Pointers | O(n log n) | O(n) |
| HashMap | O(n) average | O(n) |

## Key Learnings

- Nested loops are a useful starting point for pair-search problems.
- Sorting enables two-pointer techniques.
- HashMaps can replace repeated searches with efficient lookups.
- Always preserve original indices when the output requires them.

## Edge Cases

- Negative numbers
- Duplicate numbers, such as `[3, 3]` with target `6`
- A negative target
- A pair at opposite ends of the array

## Revision Tracker

- [ ] Understand brute force
- [ ] Implement sorting + two pointers independently
- [ ] Implement HashMap independently
- [ ] Explain time and space complexity
- [ ] Solve again without looking at the code