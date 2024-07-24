package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of nodes
        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        // Read the number of edges
        System.out.print("Enter the number of edges: ");
        int m = scanner.nextInt();

        // Initialize the adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // Read each edge and add it to the adjacency list
        System.out.println("Enter the edges (format: u v): ");
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // Close the scanner
        scanner.close();

        // Print the adjacency list
        for (int i = 1; i <= n; i++) {
            System.out.print("Node " + i + ": ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
