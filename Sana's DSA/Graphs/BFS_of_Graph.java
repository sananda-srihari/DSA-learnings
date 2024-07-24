package Graphs;
import java.util.*;
public class BFS_of_Graph {
    public ArrayList<Integer> bfsOfGraph (int V , ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);//starting node 
        visited[0] = true;

        while(!q.isEmpty())
        {
            Integer node = q.poll();
            bfs.add(node);

            for(Integer i : adj.get(node))
            {
                if(visited[i]==false)
                {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        return bfs;
    }
public static void main (String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of nodes in your graph : ");
    int n = sc.nextInt();

    System.out.print("Enter number og edges : ");
    int e = sc.nextInt();

    
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    for(int i = 0 ; i <= n ; i++){
        adj.add(new ArrayList<Integer>());
    }

    System.out.println("Enter the edges :");
    for(int i=0; i< e ; i++){
        int u = sc.nextInt();
        int v = sc.nextInt();
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
    BFS_of_Graph solution = new BFS_of_Graph();
    ArrayList<Integer> res = solution.bfsOfGraph(n, adj);

    System.out.print(res);

    sc.close();
}
}