import java.util.*;

public class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
            result.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            adjList.get(edge[0]).add(edge[1]);
        }
        for (int i = 0; i < n; i++) {
            dfs(adjList, result, i, i);
        }

        return result;
    }
    private void dfs(List<List<Integer>> adjList, List<List<Integer>> result, int i, int node){
        for (int child : adjList.get(i)) {
            if(result.get(child).isEmpty() || result.get(child).get(result.get(child).size() - 1) != node) {
                result.get(child).add(node);
                dfs(adjList, result, child, node);
            }
        }
    }
}
