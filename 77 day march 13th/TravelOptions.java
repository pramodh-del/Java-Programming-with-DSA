import java.util.*;

public class TravelOptions {

    public static int[] removeRoadOptions(int n, int m, int[] a, int[] b) {
        int[] result = new int[m];
        Map<Integer, List<Integer>> graph = buildGraph(n, m, a, b);

        for (int i = 0; i < m; i++) {
            int removedTownA = a[i];
            int removedTownB = b[i];

            // Avoid removing non-existent edges
            if (graph.get(removedTownA).contains(removedTownB)) {
                graph.get(removedTownA).remove(removedTownB);
            }
            if (graph.get(removedTownB).contains(removedTownA)) {
                graph.get(removedTownB).remove(removedTownA);
            }

            result[i] = bfs(graph, 1, n);

            // Add back the removed edges for the next iteration
            graph.get(removedTownA).add(removedTownB);
            graph.get(removedTownB).add(removedTownA);
        }

        return result;
    }

    private static Map<Integer, List<Integer>> buildGraph(int n, int m, int[] a, int[] b) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            graph.get(a[i]).add(b[i]);
            graph.get(b[i]).add(a[i]);
        }

        return graph;
    }

    private static int bfs(Map<Integer, List<Integer>> graph, int start, int destination) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            level++;

            for (int i = 0; i < size; i++) {
                int current = queue.poll();

                if (current == destination) {
                    return level - 1; // -1 to exclude the starting town
                }

                for (int neighbor : graph.get(current)) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
        }

        return -1; // No path found
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

        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        int[] result = removeRoadOptions(n, m, a, b);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
