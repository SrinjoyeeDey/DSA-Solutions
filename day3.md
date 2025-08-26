# 🚀 Day 3 – Linked List Problems

Welcome to Day 3 of my DS-Effective journey.
Today I solved 4 important Linked List problems that frequently appear in technical interviews.

Each solution includes:

✅ Problem Statement

✅ Approach (Brute Force & Optimized)

✅ Edge Cases considered

✅ Complexity Analysis

✅ Implementation in Java



---

## 📌 Problem 1: Delete N Nodes After M Nodes

Problem Statement

Given a linked list, delete N nodes after every M nodes until the end of the list.


---

Approaches

🔹 Brute Force

Traverse the list.

Maintain counters for M and N.

After skipping M nodes, manually delete next N nodes by iterating.

Continue until the end.


Drawback: Requires extra loops → less efficient.

🔹 Optimized (Two Pointers: prev & curr)

1. Start traversal with curr = head.


2. Skip M nodes using a loop.


3. From the (M+1)th node, delete N nodes by moving a temporary pointer.


4. Link curr.next to the remaining list.


5. Repeat until the end.




---

### Edge Cases

M = 0: Delete everything.

N = 0: Nothing is deleted, original list remains.

List smaller than M.

List smaller than M + N.



---

### Complexity

Time: O(n) → one traversal of the list.

Space: O(1) → constant extra space.



---

## 📌 Problem 2: Intersection of Two Singly Linked Lists

Problem Statement

Find the node where two singly linked lists merge. Return the node’s index (or value).


---

Approaches

🔹 Brute Force

For every node in list A, check all nodes in list B.

If a node matches → return index.

Time: O(m*n)


🔹 Optimized (Two Pointer Switching)

1. Use two pointers a and b.


2. Traverse both lists simultaneously.


3. When a pointer reaches the end, redirect it to the head of the other list.


4. They will eventually meet at the merge point or both become null.




---

### Edge Cases

No intersection → return -1.

One list is empty.

Lists merge at the head.



---

### Complexity

Time: O(m + n)

Space: O(1)



---

## 📌 Problem 3: Merge K Sorted Linked Lists

Problem Statement

Merge k sorted linked lists into a single sorted linked list.


---

Approaches

🔹 Brute Force

Traverse all lists, collect all elements in an array.

Sort the array.

Rebuild a new linked list.

Time: O(n log n) for sorting.


🔹 Optimized (Min-Heap / Priority Queue)

1. Insert heads of all lists into a Min Heap.


2. Extract the smallest node, append to result list.


3. Insert next node of extracted list into the heap.


4. Continue until heap is empty.




---

### Edge Cases

k = 0 → return null.

One list is empty.

All lists empty.



---

### Complexity

Time: O(n log k) (n total nodes, k lists).

Space: O(k) for heap.



---

## 📌 Problem 4: Put Even Nodes Before Odd Nodes

Problem Statement

Rearrange a linked list such that all even-valued nodes appear before odd-valued nodes, maintaining relative order.


---

Approaches

🔹 Brute Force

Create two separate lists → one for evens, one for odds.

Traverse the original list, distribute nodes.

Concatenate both lists.


🔹 Optimized (In-place Reordering with Two Pointers)

1. Maintain two dummy nodes: evenHead, oddHead.


2. Traverse list once:

If node is even → add to even list.

If node is odd → add to odd list.



3. Connect even list’s tail to oddHead.next.


4. Mark odd.next = null to avoid cycles.




---

### Edge Cases

Empty list → return null.

All even or all odd numbers.

Only one node.



---

### Complexity

Time: O(n) → single traversal.

Space: O(1) → rearranges in place.



---

📊 Summary of Complexities

Problem	Time Complexity	Space Complexity

Delete N after M	O(n)	O(1)
Intersection	O(m + n)	O(1)
Merge K Lists	O(n log k)	O(k)
Even Before Odd	O(n)	O(1)



---

📝 Notes

These problems strengthen pointer manipulation skills.

Edge cases are crucial → handling empty lists, small sizes, or special values.

Optimized solutions use two-pointer techniques and heaps.



---

🔥 This concludes Day 3 of my Linked List practice!
Tomorrow → More advanced problems 🚀
