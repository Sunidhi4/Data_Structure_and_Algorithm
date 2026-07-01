import java.util.*;
public class Graph02
{
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d)
        {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[])
    {
        for(int i=0; i<graph.length; i++)
        {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph)
    {
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++)
        {
            if(!vis[i])
            {
               if(detectCycleUtil(graph, vis, i, -1))
               {
                return true;
               }
            }
        }

        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph,boolean vis[], int curr, int par )
    {
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i);

            if(!vis[e.dest] )
             {
                 if(detectCycleUtil(graph, vis, e.dest, curr))
            {
                return true;
            }
             }
            else if(vis[e.dest] && e.dest != par)
            {
                return true;
            }
        }

        return false;
    }
    // public static void dfs (ArrayList<Edge>[] graph)
    // {
    //     boolean vis[] = new boolean[graph.length];
    //     for(int i=0; i<graph.length; i++)
    //     {
    //             dfsUtil(graph, i, vis);
    //     }
    // }

    // public static void dfsUtil(ArrayList<Edge>[] graph,int curr, boolean vis[])
    // {
    //     //O(V+E)
    //     //visit
    //     System.out.print(curr+" ");
    //     vis[curr] = true;
        
    //     for(int i=0; i<graph[curr].size(); i++)
    //     {
    //         Edge e = graph[curr].get(i);
    //         if(!vis[e.dest])
    //         {
    //             dfsUtil(graph, e.dest, vis);
    //         }
    //     }
    // }

    // public static void bfs(ArrayList<Edge>[] graph)
    // {
    //     boolean vis[] = new boolean[graph.length];
    //     for(int i=0; i<graph.length; i++)
    //     {
    //         if(!vis[i])
    //         {
    //             bfsUtil(graph, vis);
    //         }
    //     }
    // }

    // public static void bfsUtil(ArrayList<Edge> [] graph, boolean vis[])
    // {
    //     Queue<Integer> q = new LinkedList<>();
    //     q.add(0);

    //     while(!q.isEmpty())
    //     {
    //         int curr = q.remove();

    //         if(!vis[curr])
    //         {
    //             System.out.print(curr+" ");
    //             vis[curr] = true;

    //             for(int i=0; i<graph[curr].size(); i++)
    //             {
    //                 Edge e = graph[curr].get(i);
    //                 q.add(e.dest);
    //             }
    //         }
    //     }
    // }
     public static void main ( String args[]) 
{
     int V = 5;
     ArrayList<Edge> graph[] = new ArrayList[V];
     createGraph(graph);
     
    //  dfs(graph);
    // bfs(graph);
    //  System.out.println();

     System.out.println(detectCycle(graph));
} 
 } 