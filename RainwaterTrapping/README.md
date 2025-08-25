# 🌧 Rainwater Trapping Problem

## 📌 Problem Statement

Given an array height[] representing the elevation map where the width of each bar is 1, compute how much water it can trap after raining.

Example:

Input: height = [4,2,0,3,2,5]  
Output: 9


---

## 🚀 Approach: Two-Pointer Technique

Instead of calculating trapped water for each element (which would be inefficient), we use a two-pointer approach to optimize the solution.

🔹 Intuition

Water trapped at an index depends on the minimum of the maximum heights on its left and right.

Using two pointers (left & right), we can track the maximum height from both ends without storing extra arrays.



---

## 📝 Algorithm

1. Initialize two pointers:

left = 0 (start of array)

right = n - 1 (end of array)
Also, maintain two variables:

leftMax = 0, rightMax = 0



2. While left <= right:

If height[left] <= height[right]:

If height[left] >= leftMax, update leftMax.

Else, trapped water = leftMax - height[left].

Move left++.


Else:

If height[right] >= rightMax, update rightMax.

Else, trapped water = rightMax - height[right].

Move right--.




3. Keep adding trapped water at each step.




---

# ⏱ Time & Space Complexity

Time Complexity: O(n) → We scan the array only once.

Space Complexity: O(1) → Only a few variables used, no extra arrays.



---

✅ Why This Approach?

Much more efficient than the naive O(n^2) approach.

Saves memory compared to DP-based solution (O(n) extra space).

Elegant, optimal, and easy to implement.



---

🖥 Code Implementation (Java)

public int trap(int[] height) {
    int left = 0, right = height.length - 1;
    int leftMax = 0, rightMax = 0, water = 0;
    
    while (left <= right) {
        if (height[left] <= height[right]) {
            if (height[left] >= leftMax) {
                leftMax = height[left];
            } else {
                water += leftMax - height[left];
            }
            left++;
        } else {
            if (height[right] >= rightMax) {
                rightMax = height[right];
            } else {
                water += rightMax - height[right];
            }
            right--;
        }
    }
    return water;
}


---

🎯 Key Takeaways 

Demonstrates problem-solving skills using optimal approaches.

Highlights two-pointer technique, commonly used in array problems.

Efficient handling of space and time → scalable solution.



---
