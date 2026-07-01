static  boolean cycleUsingBfs( int source, ArrayList<ArrayList<Integer>>adj , boolean isVisited[])
    {
          Queue<Integer>q= new LinkedList<>();
          q.add( source);
          isVisited[source]= true;
          while( q.isEmpty()==false)
          {
                int curr = q.remove();
                for( int conn : adj.get(curr) )
                {
                    if( isVisited[conn]==true)
                    {
                        // there is a cycle
                        return true;
                    }
                    else
                    {
                        isVisited[conn]= true;
                        q.add( conn );
                    }
                }
          }
          // no cycle
          return false;
    }
    static boolean detect(ArrayList<ArrayList<Integer>>adj , boolean isVisited[])
    {
        int n = adj.size();
         for( int i=0;i<n;i++)
         {
               if( isVisited[i]== false )
               {
                     boolean result = cycleUsingBfs(i, adj, isVisited);
                     if( result== true)
                     {
                         return true;
                     }
               }
         }
         return false;
    }

class Solution {
    static int mi=Integer.MAX_VALUE;
 
    static void rec( TreeNode curr, int level)
    {
        if( curr== null)
        {
             return;
        }
        if( curr.left==null && curr.right==null )
        {
            // leaf node
             if( level< mi )
             {
                  mi= level;
             }
            return ;
        }
 
        rec( curr.left, level+1);
        rec( curr.right, level+1);
    }
    public int minDepth(TreeNode root)
    {
         if( root==null )
         {
              return 0;
         }
         mi= Integer.MAX_VALUE;
 
         rec(  root , 1 );
 
 
 
         return mi;
    }
}

class Solution 
{
    static boolean checkUsingBfs( int source, int graph[][], int color[] )
    {
         Queue<Integer>q= new LinkedList<>();
         q.add( source );
         color[ source ]=0;
 
         while( q.isEmpty()==false)
         {
              int curr= q.remove();
              int currColor= color[curr];
 
              for( int conn : graph[curr])
              {
                   if( color[conn]==-1)
                   {
                       // if conn is not colored
                       color[conn]= 1- currColor;
                       q.add( conn );
                   }
                   else
                   {
                       // already colored
                        if( currColor == color[conn] )
                        {
                            return false;
                        }
                   }
              }
         }
        return true;
    }
    public boolean isBipartite(int[][] graph) 
    {
         int n = graph.length;
         int color[]= new int[n];
         for( int i=0;i<n;i++)
         {
              color[i]=-1;
         }
         for( int i=0;i<n;i++)
         {
              if( color[i]==-1)
              {
                   boolean result= checkUsingBfs( i,  graph, color);
 
                   if( result== false)
                   {
                       return false;
                   }
              }
         }
        return true;
    } 
}

static  ArrayList<Integer> topoSort( ArrayList<ArrayList<Integer>>adj )
    {
           int n = adj.size();
           int indegree[]= new int[n];
           for( int curr=0;curr<n; curr++)
           {
               for( int conn : adj.get(curr) )
               {
                    indegree[conn]++;
               }
           }
           Queue<Integer>q= new LinkedList<>();
           for( int i=0;i<n;i++)
           {
              if( indegree[i]==0)
              {
                  q.add( i );
              }
           }
           ArrayList<Integer>ans= new ArrayList<>();
           while( q.isEmpty()==false)
           {
               int curr= q.remove();
               ans.add( curr );