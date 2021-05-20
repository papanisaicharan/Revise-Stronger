### This is learning Repository

It contain various related to computer science.

What does it contain now:
- [Blockchain Guide](/Blockchain/)
- [Solution of HackerRank Java problems](/HackerRank-Java-Recap/)



### **Arrays and List difference:**
- Array: continuous memory allocation: retrival - O(1), Insertion or deletion - O(n)
- List: not continous memory allocation, it is like linkedList. Retrival - O(n), Insertion or deletion - O(1) if we are at index i

#### Searching
Time Complexity: O(n) - unsorted array.

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

Insertion sort pactically performs well compared to other because in case the array is sorted, then it only take O(n) time complexity.

Can we perform better than O(n**2)? - Yes.

#### Merge Sort
Divide and Conquer
Time complexity: O(n log n)
recurrence relation: T(n) = 2T(n/2) + θ(n)
Stable: Yes
[https://www.geeksforgeeks.org/merge-sort/](https://www.geeksforgeeks.org/merge-sort/)

We have few shortcomes of merge sort like need an extra space for merging - Like new same sized array to keep the sorted array. But this was fixed later on.

Merge Sort with extra space of O(n)
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
Merge sort with no extra space
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


#### Quick sort
Time complexity: O(n log n)
recurrence relation: T(n) = 2T(n/2) + θ(n)

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
The second sorting should not disturb the order of the first sorting . So, this is called stable sorting.
