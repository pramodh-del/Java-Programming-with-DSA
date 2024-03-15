import java.util.*;

public class TownTraversal {

    static class Edge {
        int u, v;
        Edge(int u, int v) {
            this.u = u;
            this.v = v;
        }
    }

    public static int[] leastRoads(int n, int m, int[] a, int[] b) {
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            edges.add(new Edge(a[i], b[i]));
        }

        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            List<Edge> reducedEdges = new ArrayList<>(edges);
            reducedEdges.remove(i);
            result[i] = shortestPath(n, reducedEdges);
        }

        return result;
    }

    public static int shortestPath(int n, List<Edge> edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (Edge edge : edges) {
            graph.computeIfAbsent(edge.u, k -> new ArrayList<>()).add(edge.v);
            graph.computeIfAbsent(edge.v, k -> new ArrayList<>()).add(edge.u);
        }

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Integer> distances = new HashMap<>();

        queue.add(1);
        visited.add(1);
        distances.put(1, 0);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            int dist = distances.get(node);

            if (node == n) {
                return dist;
            }

            for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                    distances.put(neighbor, dist + 1);
                }
            }
        }

        return -1; // Indicating no path found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] a = new int[m];
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            a[i] = scanner.nextInt();
        }

        int m2 = scanner.nextInt(); // redundant m
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        int[] result = leastRoads(n, m, a, b);

        for (int val : result) {
            System.out.println(val);
        }
    }
}
