import java.util.*;

public class TopologicalSortDFS {
    static ArrayList<ArrayList<Integer>> adj;
    static void topoSortDfs(int i, boolean[] vis, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj){
        vis[i]=true;
        for(int j: adj.get(i))
        {
            if(!vis[j])
            {
                topoSortDfs(j,vis,st,adj);
            }
        }
        st.push(i);
    }
    static int[] topo(int node,ArrayList<ArrayList<Integer>> adj)
    {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[node];
        boolean vis[] = new boolean[node];
        for(int i=0;i<node;i++)
        {
            if(!vis[i])
            {
                topoSortDfs(i,vis,st,adj);
            }
        }
        int i=0;
        while(!st.isEmpty())
        {
            ans[i]=st.pop();
            i++;
        }
        return ans;
    }
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("total no. of nodes");
        int node=sc.nextInt();
        adj = new ArrayList<ArrayList<Integer>>(node);
        for(int i=0;i<node;i++)
        {
            adj.add(new ArrayList<>());
        }
        System.out.println("enter v and u for directed graph");
        for(int i=0;i<node;i++)
        {
            int v = sc.nextInt();
            int u = sc.nextInt();
            adj.get(v).add(u);
        }
        int res[] = topo(node,adj);
        System.out.print("topological sort result = ");
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
