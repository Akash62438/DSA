
import java.util.*;

public class AdjacencyList {

    static ArrayList<Integer> outputDFS = new ArrayList<>();
    static ArrayList<Integer> outputBFS = new ArrayList<>();

    public static void Addedge(ArrayList<ArrayList<Integer>> AL, int u, int v) {
        AL.get(u).add(v);
        AL.get(v).add(u);
    }

    public static void printGraph(ArrayList<ArrayList<Integer>> AL) {
        for (int i = 0; i < AL.size(); i++) {
            System.out.print("Vertex " + i + ": ");
            for (int edge : AL.get(i)) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }

    public static void dfs(int source, boolean[] visdfs, ArrayList<ArrayList<Integer>> adj) {

        visdfs[source] = true;
        outputDFS.add(source);

        for (int i : adj.get(source)) {
            if (visdfs[i] == false) {
                dfs(i, visdfs, adj);
            }
        }

    }

    public static void bfs(int source, boolean[] visbfs, ArrayList<ArrayList<Integer>> adj) {

        Queue<Integer> q1 = new LinkedList<>();

        q1.add(source);
        while (!q1.isEmpty()) {
            int x = q1.remove();

            if (visbfs[x] == false) {
                visbfs[x] = true;
                outputBFS.add(x);

                for (int i : adj.get(x)) {
                    q1.add(i);
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of vertex u want to enter : ");
        int v = sc.nextInt();
        System.out.print("enter number of edge u want to enter : ");
        int e = sc.nextInt();
        ArrayList<ArrayList<Integer>> al = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            al.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < e; i++) {

            System.out.println("enter connection of : ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            Addedge(al, x, y);

        }

        System.out.println(al);
        System.out.println("");

        printGraph(al);

        boolean[] visdfs = new boolean[v];
        System.out.println("\nDFS Traversal starting from vertex :");
        int startdfs = sc.nextInt();
        dfs(startdfs, visdfs, al);
        System.out.println("DFS Output: " + outputDFS);

        boolean[] visBfs = new boolean[v];
        System.out.println("\nDFS Traversal starting from vertex :");
        int startbfs = sc.nextInt();
        bfs(startbfs, visBfs, al);
        System.out.println("BFS Output: " + outputBFS);

    }
}
