//perform a BFS traversal of a graph starting from vertex 0 ,
//visiting vertices from left to right according to adjacency list and return a list containing the BFS traversal of the graph.
// input : adj[][]=[[1,2],[0,2,3],[1,4],[2,3]]
// output: [0, 1, 2, 3, 4]

import java.util.*;

import java.util.Scanner;

public class BFS {
    public static void main(String[] args) {
        // Graph definition
        int[][] adj = {
            {1, 2},        
            {0, 2, 3},     
            {1, 4},       
            {2, 3},        
            {}             
        };

        int n = adj.length;
        boolean[] visited = new boolean[n];
        int[] queue = new int[n];
        int front = 0, rear = 0;

        // Enqueue starting vertex 0
        visited[0] = true;
        queue[rear++] = 0;

        System.out.print("BFS Traversal: ");

        while (front < rear) {
            int current = queue[front++];  // Dequeue
            System.out.print(current + " ");

            // Visit neighbors
            for (int i = 0; i < adj[current].length; i++) {
                int neighbor = adj[current][i];
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue[rear++] = neighbor;  // Enqueue
                }
            }
        }

        System.out.println();
    }
}
