# ➕ 3Sum Problem

## 📌 Problem Statement
Given an integer array nums, return all unique triplets [nums[i], nums[j], nums[k]] such that:

i != j, j != k, i != k, nums[i] + nums[j] + nums[k] == 0

The solution set must not contain duplicate triplets.

---

## 🧩 Example

*Input:*  
```text
nums = [-1, 0, 1, 2, -1, -4]

Output:

[[-1, -1, 2], [-1, 0, 1]]


---

💡 Approaches Implemented

1️⃣ Brute Force (Triple Loop)

Check every possible triplet (i, j, k).

If the sum equals zero, add to the result set.

Use sorting inside the set to avoid duplicates.


⏱ Time Complexity: O(n³)
📦 Space Complexity: O(n) (for storing results)


---

2️⃣ Hashing (Two Sum Extension)

Fix one element nums[i].

Use a hash set to detect if target - nums[j] exists (where target = -nums[i]).

Helps reduce one loop compared to brute force.


⏱ Time Complexity: O(n²)
📦 Space Complexity: O(n)


---

3️⃣ Two-Pointer (Optimized Approach)

Sort the array.

Fix one element nums[i], then use two pointers (j, k) to find pairs that sum to -nums[i].

Skip duplicates to ensure uniqueness.


⏱ Time Complexity: O(n²)
📦 Space Complexity: O(1) (ignoring result storage)


---

🚀 Why Multiple Approaches?

✅ Brute force shows the naive method (useful for understanding).

✅ Hashing introduces optimization using sets.

✅ Two-pointer is the industry-standard efficient solution.


This demonstrates not just solving the problem, but also understanding optimization trade-offs — a critical skill for interviews.


---

📝 How to Run

Compile and run the program:

javac threesum.java
java threesum

Expected Output:

[[-1, -1, 2], [-1, 0, 1]]
[[-1, -1, 2], [-1, 0, 1]]
[[-1, -1, 2], [-1, 0, 1]]


---

---
