// Represent adjacency list for a directed graph using an array of ArrayLists

 class adjecent_nodes {
    public static void main(String[] args) {
        int v = 3; 
        int[][] edges = { {0, 1}, {1, 2}, {2, 0} };

        int[][] adjMatrix = new int[v][v];

        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            adjMatrix[from][to] = 1;
        }

        // Print adjacency list format
        for (int i = 0; i < v; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < v; j++) {
                if (adjMatrix[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
