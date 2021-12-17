### **Arrays and List difference:**
- Array: continuous memory allocation: retrival - O(1), Insertion or deletion - O(n)
- List: not continous memory allocation, it is like linkedList. Retrival - O(n), Insertion or deletion - O(1) if we are at index i

#### Searching
Time Complexity: O(n) - unsorted array.

https://www.cs.usfca.edu/~galles/visualization/Search.html

###### Python
```python
def search(arr, k):
    for i in range(len(arr)):
        if arr[i] == k: return i
    return -1
```
###### Java
```java
public static int search(int[] arr, int k){
    for(int i = 0; i < arr.length; i++){
        if(arr[i]==k) return i;
    }
    return -1;
}
```

#### Binary search
Time complexity - O(log n) - sorted array.

https://www.cs.usfca.edu/~galles/visualization/Search.html

###### Python
```python
def binsearch(self, arr, k, l, r):
    # base condition - if no elements exist
    if r-l == 0: return -1
    # find mid point
    mid = (r+l)//2
    if arr[mid] == k: return mid
    if k < arr[mid]:
        return self.binsearch(arr, k, l, mid)
    if k > arr[mid]:
        return self.binsearch(arr, k , mid+1, r)
```
###### Java
```java
public int binSearch(int[] nums, int k, int l, int r){
    // base condition - if no elements exist
    if(r-l==0)
        return -1;
    int mid = l + (r - l) / 2;
    // System.out.println(mid);
    if(nums[mid]==k)
        return mid;
    else if(nums[mid]>k)
        return binSearch(nums, k ,l, mid);
    else if(nums[mid]<k)
        return binSearch(nums, k ,mid+1, r);
    else
        return -1;
}
```

https://www.geeksforgeeks.org/stability-in-sorting-algorithms/

https://www.cs.usfca.edu/~galles/visualization/ComparisonSort.html

#### Selection Sort
- Stability: By default not stable, but can be made stable
- Yet to look into stable one [https://www.geeksforgeeks.org/stable-selection-sort/](https://www.geeksforgeeks.org/stable-selection-sort/)
- In place
- Time complexity - O(n**2)
- [https://www.geeksforgeeks.org/selection-sort/](https://www.geeksforgeeks.org/selection-sort/)

###### Python
```python
def sortArray(self, nums: List[int]) -> List[int]:
    l = len(nums)
    for i in range(l):
        minpos = i
        # find the ith min and swap it with ith location
        for j in range(i+1, l):
            if nums[j] < nums[minpos]:
                minpos = j
        nums[minpos], nums[i] = nums[i], nums[minpos]
    return nums
```
###### Java
```java
class Solution {
    public int[] sortArray(int[] nums) {
        int l = nums.length;
        for(int i = 0; i < l ; i++){
            int minpos = i;
            // find the ith min and swap it with ith location
            for(int j = i+1; j < l; j++){
                if(nums[minpos] > nums[j]){
                    minpos = j;
                }
            }
            int temp = nums[minpos];
            nums[minpos] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
```

#### Insertion Sort
- Sorting In Place
- Stable: Yes
- yet to look [https://www.geeksforgeeks.org/insertion-sort/](https://www.geeksforgeeks.org/insertion-sort/)
- Time complexity - O(n**2)

###### Python
```python
def sortArray(self, nums: List[int]) -> List[int]:
    l = len(nums)
    for i in range(1,l):
        cur = i
        # we have the boundary which divides array into two parts
        # first part is sorted and second part is unsorted
        # continously pick values from second part and place it in the right position in the first part
        while cur > 0 and nums[cur] < nums[cur-1]:
            nums[cur], nums[cur-1] = nums[cur-1], nums[cur]
            cur-=1
    return nums
```
###### Java
```java
 public int[] sortArray(int[] nums) {
    int l = nums.length;
    for(int i = 1; i < l ; i++){
        int minpos = i;
        // we have the boundary which divides array into two parts
        // first part is sorted and second part is unsorted
        // continously pick values from second part and place it in the right position in the first part
        while(minpos > 0 && nums[minpos] < nums[minpos-1]){
            int temp = nums[minpos];
            nums[minpos] = nums[minpos-1];
            nums[minpos-1] = temp;
            minpos-=1;
        }
    }
    return nums;
}
```

##### Special
LinkedList insertion sort:

###### Python
```python
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def insertionSortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        prev = dummy
        curr = head
        next = None
        
        while curr != None:
            next = curr.next
            while prev.next != None and prev.next.val < curr.val:
                prev = prev.next
            
            curr.next = prev.next
            prev.next = curr
            
            prev = dummy
            curr = next
            
        return dummy.next
```
##### Java
```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        ListNode curr = head;
        ListNode next;
        
        while(curr != null){
            next = curr.next;
            while(prev.next != null && prev.next.val < curr.val) prev = prev.next;
            curr.next = prev.next;
            prev.next = curr;
            
            prev = dummy;
            curr = next;
        }
        
        return dummy.next;
    }
}
```

#### Bubble sort
- Sorting In Place
- Stable: Yes
- yet to go through :[https://www.geeksforgeeks.org/bubble-sort/](https://www.geeksforgeeks.org/bubble-sort/)
- Time complexity - O(n**2)

###### Python
```python
class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        l = len(nums)
        for i in range(l):
            for j in range(l-i-1):
                if nums[j] > nums[j+1]:
                    nums[j], nums[j+1] = nums[j+1], nums[j]
        return nums
```
###### Java
```java
class Solution {
    public int[] sortArray(int[] nums) {
        int l = nums.length;
        for(int i = 0; i < l ; i++){
            for(int j = 0; j < l-i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
}
```

**Insertion sort pactically performs well** compared to other because in case the array is sorted, then it only take O(n) time complexity.

**Can we perform better than O(n**2)? - Yes.**

It is better to learn master method for calculating the master method.
https://en.wikipedia.org/wiki/Master_theorem_(analysis_of_algorithms)

#### Merge Sort
- Divide and Conquer
- Time complexity: O(n log n)
- Recurrence relation: T(n) = 2T(n/2) + θ(n)
- Stable: Yes
- [https://www.geeksforgeeks.org/merge-sort/](https://www.geeksforgeeks.org/merge-sort/)

We have few shortcomes of merge sort in terms of extra space for merging - new same sized array is created to keep the sorted array. But this was fixed later on.

Merge Sort with extra space of O(n)

###### Drawbacks:
- Slower comparative to the other sort algorithms for smaller tasks.
- Merge sort algorithm requires an additional memory space of 0(n) for the temporary array.
- It goes through the whole process even if the array is sorted.

##### Python
```python
def merge(A, m, B, n, C):
    # merge A and B to C
    i, j, k = 0, 0, 0
    
    while k < m+n:
        # if B is complete or A[i] <= B[j]
        if j==n or A[i] <= B[j]:
            C[k]= A[j]
            i+=1
            k+=1
        # if B is complete or A[i] > B[j]
        if i==m or A[i] > B[j]:
            C[k] = B[j]
            j+=1
            k+=1
                
def mergeSort(A, left, right, B):
    # sort A into B
    
    # only one element
    if right - left == 1:
        B[0] = A[left]
        
    if (right - left > 1):
        mid  = (left+right)//2
        mergeSort(A, left, mid, L)
        mergeSort(A, mid, right, R)
        
        merge(L, mid-left, R, right-mid, B)
```

Merge sort with no extra space, except O(n) space.

```python
def mergeSort(self, nums):
        if len(nums)>1:
            mid = len(nums)//2
            L = nums[:mid]
            R = nums[mid:]
            
            self.mergeSort(L)
            self.mergeSort(R)
            
            i, j, k, ll, rl = 0, 0, 0, len(L), len(R)
            
            while i < ll and j < len(R):
                if L[i] <= R[j]:
                    nums[k] = L[i]
                    i+=1
                else:
                    nums[k] = R[j]
                    j+=1
                k+=1
            
            while i < ll:
                nums[k] = L[i]
                i+=1
                k+=1
            
            while j < rl:
                nums[k] = R[j]
                j+=1
                k+=1
```

##### Java
```java
// "static void main" must be defined in a public class.
public class MergeSort {
    
    public void sort(int[] arr, int l, int r){
        if(r > l){
            int mid = l + (r-l)/2;
            sort(arr, l, mid);
            sort(arr, mid+1, r);

            merge(arr, l, mid, r);
        }
    }
    
    public void merge(int[] arr, int l, int mid, int r){
        int l1 = mid - l + 1;
        int l2 = r - mid;
        int[] L = new int[l1];
        int[] R = new int[l2];
        for(int i = 0; i < l1; i++){
            L[i] = arr[i+l];
        }
        for(int i = 0; i < l2; i++){
            R[i] = arr[i+mid+1];
        }
        int i = 0, j = 0, k = l;
        while(i < l1 && j < l2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < l1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < l2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    static void printArray(int arr[], int l, int r)
    {
        int n = arr.length;
        for (int i = l; i < r+1; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
  
    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
  
        System.out.println("Given Array");
        printArray(arr);
  
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);
  
        System.out.println("\nSorted array");
        printArray(arr);
    }
}
```

Try solving this: https://leetcode.com/problems/sort-an-array/submissions/


#### Quick sort
- Time complexity: O(n log n) (Solve below by repeated substitution to get this time complexity)
- recurrence relation: T(n) = 2T(n/2) + θ(n)
- https://www.geeksforgeeks.org/quick-sort/
- O(n sqr) is the array is already sorted
- Various way of picking the pivots - first, last, median etc but randomized pivot gives better time complexity
- Although this algo is seems recursive, it can be solved in an iterative fashion by storing left and right halfs in a stack(store indexes only). In every iteration pull out one and push two half after placing pivot in it's place. [explore more on the internet]

```python
# forward partitioning
    # Worst case time complexity: O(n**2) -> this rare to come, so we consider avg case
    # Avg case Time complexity: O(n log n)
    def quicksort(arr, l, r):
        # if array has only 1 or 0 elements
        if r-l <= 1: return
        # consider first element as pivot - at l
        # yellow denotes the right boundary of lower partition
        yellow = l+1
        # green denotes the right boundary of higher partition
        for green in range(l+1, r):
            # if some green index value is less than pivot then swap it with 
            # yellow and increase the boundary index
            if arr[green] <= arr[l]:
                arr[green], arr[yellow] = arr[green], arr[yellow]
                yellow+=1
        # finally bring the pivot the right place
        arr[l], arr[yellow-1] = arr[yellow-1], arr[l]
        # perform quicksort on both left and right partition
        quicksort(arr, l, yellow)
        quicksort(arr, yellow+1, r)
        
        # there is another way where both green and yellow move in 
        # opposite direction - both actually results same complexity
```

#### Stable sorting: 
The second sorting should not disturb the order of the first sorting. 
