import java.util.*;

public class Graph {
    
    // We use a HashMap to store the adjacency list.
    // Key: The Vertex, Value: A List of connected vertices.
    private Map<Integer, List<Integer>> adjVertices;

    // Constructor
    public Graph() {
        this.adjVertices = new HashMap<>();
    }

    // 1. Method to add a new vertex to the graph
    public void addVertex(int vertex) {
        // Only add the vertex if it doesn't already exist
        adjVertices.putIfAbsent(vertex, new ArrayList<>());
    }

    // 2. Method to add an edge between two vertices
    public void addEdge(int source, int destination) {
        // Ensure both vertices exist in the map before adding an edge
        addVertex(source);
        addVertex(destination);

        // Add destination to source's list
        adjVertices.get(source).add(destination);
        
        // Add source to destination's list (Because this is an UNDIRECTED graph)
        // Note: If you want a directed graph, simply delete or comment out the line below.
        adjVertices.get(destination).add(source);
    }

    // 3. Method to print the graph
    public void printGraph() {
        System.out.println("Graph Adjacency List:");
        for (Map.Entry<Integer, List<Integer>> entry : adjVertices.entrySet()) {
            System.out.println("Vertex " + entry.getKey() + " is connected to -> " + entry.getValue());
        }
    }

    // Main method to test the graph
    public static void main(String[] args) {
        Graph myGraph = new Graph();

        // Adding vertices (optional, as addEdge will create them if they don't exist)
        myGraph.addVertex(1);
        myGraph.addVertex(2);
        myGraph.addVertex(3);
        myGraph.addVertex(4);

        // Adding edges
        myGraph.addEdge(1, 2);
        myGraph.addEdge(1, 3);
        myGraph.addEdge(2, 4);
        myGraph.addEdge(3, 4);
        myGraph.addEdge(1, 4);

        // Display the graph
        myGraph.printGraph();
    }
}