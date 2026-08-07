# Cycle Detection in Undirected Graph

## 1. Using DFS (Depth-First Search)

```java
class Solution {

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, visited, adj))
                    return true;
            }
        }

        return false;
    }

    boolean dfs(int node, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;

        for (int neighbour : adj.get(node)) {
            if (!visited[neighbour]) {
                if (dfs(neighbour, node, visited, adj))
                    return true;
            } else if (neighbour != parent) {
                return true;
            }
        }

        return false;
    }
}
```

## 2. Using BFS
import java.util.*;

```java
class Solution {

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (bfs(i, visited, adj))
                    return true;
            }
        }

        return false;
    }

    boolean bfs(int start, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        Queue<int[]> q = new LinkedList<>();

        visited[start] = true;
        q.offer(new int[]{start, -1});

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int node = curr[0];
            int parent = curr[1];

            for (int neighbour : adj.get(node)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.offer(new int[]{neighbour, node});
                } else if (neighbour != parent) {
                    return true;
                }
            }
        }

        return false;
    }
```
}
