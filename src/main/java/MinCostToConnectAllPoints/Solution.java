package MinCostToConnectAllPoints;

/**
 * You are given an array points representing integer coordinates of some points on a 2D-plane, where points[i] = [xi, yi].
 * <p>
 * The cost of connecting two points [xi, yi] and [xj, yj] is the manhattan distance between them: |xi - xj| + |yi - yj|, where |val| denotes the absolute value of val.
 * <p>
 * Return the minimum cost to make all points connected. All points are connected if there is exactly one simple path between any two points.
 */
class Solution {
    public int minCostConnectPoints(int[][] points) {
        int[][] graph = createGraph(points);
        return calculateCostOfMST(graph);
    }

    private int[][] createGraph(int[][] points) {
        int[][] graph = new int[points.length][points.length];
        for (int i = 0; i < points.length; i++) {
            int[] firstPoint = points[i];
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    int[] secondPoint = points[j];
                    int cost = Math.abs(firstPoint[0] - secondPoint[0]) + Math.abs(firstPoint[1] - secondPoint[1]);
                    graph[i][j] = cost;
                }
            }
        }
        return graph;
    }


    private int calculateCostOfMST(int[][] graph) {
        int count = 0;
        int countOfVertices = graph.length;
        boolean[] addedToTree = new boolean[countOfVertices];
        addedToTree[0] = true;
        for (int i = 0; i < countOfVertices - 1; i++) {
            int minDistance = Integer.MAX_VALUE;
            int nextVertex = 0;
            int distance = 0;
            for (int j = 0; j < countOfVertices; j++) {
                if (addedToTree[j]) {
                    for (int k = 0; k < countOfVertices; k++) {
                        distance = graph[j][k];
                        if (!addedToTree[k] && distance != 0 && minDistance > distance) {
                            minDistance = distance;
                            nextVertex = k;

                        }
                    }
                }
            }
            count += minDistance;
            addedToTree[nextVertex] = true;
        }
        return count;
    }
}