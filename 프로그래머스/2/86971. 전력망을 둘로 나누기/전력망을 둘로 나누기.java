import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < wires.length; i++) 
        {
            List<List<Integer>> graph = buildGraph(n, wires, i);
            boolean[] visited = new boolean[n + 1];
            int count = countNodes(graph, visited, 1); // 노드 1부터 탐색
            int diff = Math.abs(n - count - count);
            min = Math.min(min, diff);
            System.out.println(graph);
        }
        return min;
    }
    public List<List<Integer>> buildGraph(int n, int[][] wires, int index)
    {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) 
            graph.add(new ArrayList<>());//그래프에 포함된 노드를 만든다.
        for(int i = 0; i < wires.length; i++)
        {
            if(i == index)
                continue;
            int val = wires[i][0];
            int val2 = wires[i][1];
            graph.get(val).add(val2);//해당 노드와 연결된 노드들을 저장
            graph.get(val2).add(val);//양방향성 이기 때문에 반대도 저장.
        }
        return graph;
    }
    public int countNodes(List<List<Integer>> graph, boolean[] visited, int start)
    {
        int count = 1;
        visited[start] = true;
        
        for(int neighbor : graph.get(start))
        {
            if(!visited[neighbor])
                count += countNodes(graph, visited, neighbor);
        }
        return count;
    }
}