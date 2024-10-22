class Solution {
    static class Edge{
        int src;
        int des;

        public Edge(int src, int des){
            this.src = src;
            this.des = des;
        }
    }

    public boolean[] visited;
    public ArrayList<Edge>[] graph;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        visited = new boolean[n];
        graph = new ArrayList[n];

        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < edges.length; i++){
            graph[edges[i][0]].add(new Edge(edges[i][0], edges[i][1])); 
            graph[edges[i][1]].add(new Edge(edges[i][1], edges[i][0]));
        }

        return dfs(source, destination);
    }

    public boolean dfs(int source, int destination){
        if(source == destination){
            return true;
        }

        visited[source] = true;

        for(int i = 0; i < graph[source].size(); i++){
            Edge curr = graph[source].get(i);

            if(!visited[curr.des] && dfs(curr.des, destination))
                return true;
        }

        return false;
    }
}