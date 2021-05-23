### Python

```python
# Find max value in an array
# Time complexity: O(n)
def maxVal(arr):
    mx_ = arr[0]
    for i in range(1, len(arr)):
        mx_ = max(mx_, arr[i])
    return mx_

# All elements in array are distinct?
# Time complexity - O(n**2)
def allDistinct(arr):
    for i in range(len(arr)):
        for j in range(i+1, len(arr)):
            if arr[i] == arr[j]: return False
    return True

# Matrix multiplication - suppose both are 2d matrix with same size n x n
# Time complexity - O(n**3)
def matrixMulti(arr1, arr2, n):
    c = [[0]*n]*n
    for i in range(n):
        for j in range(n):
            for k in range(n):
                c[i][j]+= arr1[i][k] * arr2[k][j]
    return c

# Number of bits
# Time complexity - O(log n)
# n, n/2, n/4, ...1 -> what is k for 1 x 2**k => log k to the base 2
def numberOfBits(n):
    count = 1
    while n > 1:
        count+=1
        n = n//2
    return count

# Tower of Honai - Recursive solution
# M(n) - number of moves to transfer n disks
# move n-1 disks from A to C, using B as transit - M(n-1)
# move largest disk from A to B - M(1)
# move n-1 disks from C to B, using A as transit - M(n-1)
# Time complexity - M(n) = M(n-1) + M(1) + M(n-1) = 2**n - 1
    
```

### Java

```java
// Find max value in an array
// Time complexity: O(n)
public static int maxVal(int[] nums){
    int mx_ = nums[0];
    for(int i = 1; i < nums.length; i++){
        if(mx_ < nums[i]){
            mx_ = nums[i];
        }
    }
    return mx_;
    }

// All elements in array are distinct?
// Time complexity - O(n**2)
public static boolean allDistinct(int[] nums){
    for(int i = 0; i < nums.length; i++){
        for(int j = i+1; j < nums.length; j++){
            if(nums[i] == nums[j])
                return false;
        }
    }
    return true;
}

// Matrix multiplication - suppose both are 2d matrix with same size n x n
// Time complexity - O(n**3)
public static int[][] matrixMulti(int[][] arr1, int[][] arr2, int n){
    int[][] c = new int[n][n];
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            for(int k = 0; k < n; k++){
                c[i][j]+= arr1[i][k] * arr2[k][j];
            }
        }
    }
    return c;
}


# Number of bits
# Time complexity - O(log n)
# n, n/2, n/4, ...1 -> what is k for 1 x 2**k => log k to the base 2
public static int numberOfBits(int n){
    int count = 1;
    while(n>1){
        count+=1;
        n = (int)n/2;
    }
    return count;
}

# Tower of Honai - Recursive solution
# M(n) - number of moves to transfer n disks
# move n-1 disks from A to C, using B as transit - M(n-1)
# move largest disk from A to B - M(1)
# move n-1 disks from C to B, using A as transit - M(n-1)
# Time complexity - M(n) = M(n-1) + M(1) + M(n-1) = 2**n - 1
```