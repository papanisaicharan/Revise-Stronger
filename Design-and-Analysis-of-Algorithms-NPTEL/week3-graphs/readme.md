### Graphs

- Graphs contain: 
	- vertices or nodes
	- edges
- Types:
	- directed
		- Traveling by flight from one city to other
	- undirected
		- Graph coloring problem: no neigbour should have the same color
		

#### Graph representation

Both have their own advantages and disadvantages:

- Adjacency matrix
	- Easier to say if j is neighbour of i. 
	- Takes more space
	- More time to find out all neighbours of i
	- <img src="../images/adjacencymatrix.png" width="400" height="300">
- Adjacency list
	- More time to find out whether j is a neighbour of i.
	- less space
	- less time to find out all neighbours of i.
	- <img src="../images/adjacencyList.png" width="400" height="300">

**Strategy for finding a path connecting a source vertex to a target vertex**

Start at the source vertex and start exploring using either of the below ways. 

- Breadth first search
	- level by level
- Depth first search
	- Go as deep as possible for every vertex

Mark vertices that have been visited and keep track of vertices whose neighbours have already been explored.

#### Breadth first search:

Explore the graph level by level

Time complexity analysis:
- Each vertex enters the queue exactly once. And queue is iterated. 
- For each element we again scan for it's neighbours and we have to traverse the neighbour too.  
- So, time complexity is O(pow(n,2)) - worst case

Can we reduce it? - **Yes**
- we can reduce it by using adjacency list instead of matrix
- Across the loop, each edge (i,j) is scanned twice. once when exploring i and again when exploring j.
- So, each node will be explored twice. We,  can simply say that we are exploring all the edges once.
- So, overall exploring the neighbors across all n iteration takes times O(m).
- plus the algo again take O(n) for creating the visited array
- It becomes - O(n+m)

##### Python
```python
def dfs(self, i, adjacencyList):
	# Mark all the vertices as not visited
	visited = [0] * len(adjacencyList)
	# Create a queue for BFS
	queue = []
	# Mark the source node as visited and enqueue it
	visited[i] = 1
	queue.append(i)
	while len(queue):
		# Dequeue a vertex from queue and print it
		head = queue.pop(0)
		print (head, end = " ")
		# Get all adjacent vertices of the dequeued vertex s. If a adjacent
		# has not been visited, then mark it visited and enqueue it
		for j in adjacencyList[head] :
			if visited[j] == 0:
				visited[j] = 1
				queue.append(j)
adjacencyList = {0: [1, 2], 1: [2], 2: [0, 3], 3: [3]}
dfs(2, adjacencyList)
```
##### Java
```java
// int v = 4;
// LinkedList[] adj = new LinkedList[v];
// for (int i=0; i<v; ++i)
//     adj[i] = new LinkedList();
// adj[0].add(1);
// adj[0].add(2);
// adj[1].add(2);
// adj[2].add(0);
// adj[2].add(3);
// adj[3].add(3);
// bfs(2, adj);

public void bfs(int s, LinkedList[] adj){
	// Mark all the vertices as not visited(By default set as false)
	boolean[] visited = new boolean[adj.length];

	// Create a queue for BFS
	LinkedList<Integer> queue = new LinkedList<Integer>();

	// Mark the current node as visited and enqueue it
	visited[s] = true;
	queue.add(s);

	while(queue.size() != 0){
		// Dequeue a vertex from queue and print it
		s = queue.poll();
		System.out.println(s+" ");

		// Get all adjacent vertices of the dequeued vertex s
		// If a adjacent has not been visited, then mark it
		// visited and enqueue it
		Iterator<Integer> i = adj[s].listIterator();
		while(i.hasNext()){
			int n = i.next();
			if(!visited[n]){
				visited[n] = true;
				queue.add(n);
			}
		}
	}
}
```

#### **Level order printing:**
##### Python
```python

# Input: root = [3,9,20,null,null,15,7]
# Output: [[3],[9,20],[15,7]]

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# we can implement this in a different way as below java code, but writing to show a different variation and thought process.
class Solution:
    def levelOrder(self, root: TreeNode) -> List[List[int]]:
        ans, level = [], [root]
        while root and level:
            ans.append([node.val for node in level])
            LRPairs = [(node.left, node.right) for node in level]
            level = [node for pairs in LRPairs for node in pairs if node]
        return ans
```
##### Java
```java
/**
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[3],[9,20],[15,7]]
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        levelHelper(root, ans, 0);
        return ans;
    }
    
    public void levelHelper(TreeNode node, List<List<Integer>> ans, int level){
        if(node == null) return;
        if(level >= ans.size()){
            ans.add(new ArrayList<Integer>());
        }
        ans.get(level).add(node.val);
        levelHelper(node.left, ans, level+1);
        levelHelper(node.right, ans, level+1);
    }
}
```

#### Find the path and level of a node from given Ith vertex
##### Python
```python
# we get the path it followed to get to a target from ith vertex using parent array links
# We get the level of each node from a given ith vertex
def dfs(self, i, adjacencyList):
    # set all the nodes level and parent as -1
    level = [-1] * len(adjacencyList)
    parent = [-1] * len(adjacencyList)
    # Create a queue for BFS
    queue = []
    # Mark the source node as visited and enqueue it
    level[i] = 0
    queue.append(i)
    while len(queue):
        # Dequeue a vertex from queue and print it
        head = queue.pop(0)
        print (head, end = " ")
        # Get all adjacent vertices of the dequeued vertex head. If a adjacent
        # has not been visited, then mark it visited and enqueue it
        # simultaneously record the level and parent.
        for j in adjacencyList[head] :
            if level[j] == -1:
                level[j] = 1+level[head]
                parent[j] = head
                queue.append(j)
adjacencyList = {0: [1, 2], 1: [2], 2: [0, 3], 3: [3]}
dfs(2, adjacencyList)
```
##### Java
```java
// int v = 4;
// LinkedList[] adj = new LinkedList[v];
// for (int i=0; i<v; ++i)
//     adj[i] = new LinkedList();
// adj[0].add(1);
// adj[0].add(2);
// adj[1].add(2);
// adj[2].add(0);
// adj[2].add(3);
// adj[3].add(3);
// bfs(2, adj);

public void bfs(int s, LinkedList[] adj){
	// Mark all the vertices as not visited(By default set as false)
	// use level and parent arrar to find out level and parent of a node.
	boolean[] visited = new boolean[adj.length];
    int[] level = new int[adj.length];
    int[] parent = new int[adj.length];

	// Create a queue for BFS
	LinkedList<Integer> queue = new LinkedList<Integer>();

	// Mark the current node as visited and enqueue it
	visited[s] = true;
    level[s] = 0;
	queue.add(s);

	while(queue.size() != 0){
		// Dequeue a vertex from queue and print it
		s = queue.poll();
		System.out.println(s+" ");

		// Get all adjacent vertices of the dequeued vertex s
		// If a adjacent has not been visited, then mark it
		// visited and enqueue it
		Iterator<Integer> i = adj[s].listIterator();
		while(i.hasNext()){
			int n = i.next();
			if(!visited[n]){
				visited[n] = true;
                level[n] = level[s] + 1;
                parent[n] = s;
				queue.add(n);
			}
		}
	}
}
```

- Breadth first search if we add this level predicate, it actually gives us the shortest path to each node in terms of number of edges.
- Now, in general, we will see that, if you do not have the uniform cost, we have different cost on edges, then the shortest path need not be just the shortest in term to number of edges. We have to add the cost associated each path these are called weighted graphs.


------------

#### Depth first search

Depth first search instead of exploring all vertices level by level .Each time we explore a new vertex. then immediately explore it's children.

- Start from i, visit a neighbour j.
- Suspend the exploration of i and explore J instead.
- Continue till you reach a vertex with no unexplored neighbours
- Backtrack to nearest suspended vertex that still has an unexplored neighbour and repeat the same process.

Time complexity: Same as bfs - O(m+n)

##### Python
```python
def dfs(i):
    global visited
    global parent
    global adj
    visited[i] = 1
    print("current Node: ",i)
    for neighbour in adj[i]:
        if visited[neighbour] == 0:
            visited[neighbour] = 1
            parent[neighbour] = i
            dfs(neighbour)
adj = {0: [1, 2], 1: [2], 2: [0, 3], 3: [3]}
visited = [0] * len(adj)
parent = [-1] * len(adj)
dfs(2)
# 2 is the root node here
print("visited: ", visited)
print("parents : ",parent )
```
##### Java
```java
// int v = 4;
// LinkedList<Integer>[] adj = new LinkedList[v];
// // LinkedList<Integer>[] vertex = new LinkedList[5];
// for (int i=0; i<v; ++i)
//     adj[i] = new LinkedList();
// adj[0].add(1);
// adj[0].add(2);
// adj[1].add(2);
// adj[2].add(0);
// adj[2].add(3);
// adj[3].add(3);
// boolean[] visited = new boolean[adj.length];
// int[] parent = new int[adj.length];
// dfs(2, adj, visited, parent);
// for(boolean i : visited)
//     System.out.println(i);
// for(int i : parent)
//       System.out.println(i);
    
// instead of passing we can set them as globals
public static void dfs(int s, LinkedList[] adj, boolean[] visited, int[] parent){

    // Mark the current node as visited
    visited[s] = true;
    System.out.println(s);

    Iterator<Integer> i = adj[s].listIterator();
    while(i.hasNext()){
        int n = i.next();
        if(!visited[n]){
            parent[n] = s;
            dfs(n, adj, visited, parent);
        }
    }
}
```