import java.util.*;

public class mines {
    
    static class Node implements Comparable<Node> {
        int id;
        int cost;
        
        public Node(int id, int cost) {
            this.id = id;
            this.cost = cost;
        }
        
        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.cost, other.cost);
        }
    }
    
    static int dijkstra(int[][] graph, int start, int end, Set<Integer> mines) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;
        
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        
        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int u = node.id;
            
            if (visited[u]) continue;
            visited[u] = true;
            
            if (u == end) return distance[u];
            
            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] != 0 && !mines.contains(v)) {
                    int alt = distance[u] + graph[u][v];
                    if (alt < distance[v]) {
                        distance[v] = alt;
                        pq.offer(new Node(v, alt));
                    }
                }
            }
        }
        
        return -1; // No path found
    }
    
    public static void main(String[] args) {
        // Example usage
        int[][] graph = {
            {0, 1, 4, 0, 0},
            {1, 0, 4, 2, 7},
            {4, 4, 0, 3, 5},
            {0, 2, 3, 0, 4},
            {0, 7, 5, 4, 0}
        };
        
        Set<Integer> mines = new HashSet<>();
        mines.add(1); // Assuming node 1 is a mine
        
        int start = 0;
        int end = 4;
        
        int shortestPath = dijkstra(graph, start, end, mines);
        if (shortestPath != -1) {
            System.out.println("Shortest path from " + start + " to " + end + " avoiding mines: " + shortestPath);
        } else {
            System.out.println("No path from " + start + " to " + end + " avoiding mines.");
        }
    }
}


