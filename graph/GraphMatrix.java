public class GraphMatrix {
    
    // A 2D array to store the edges
    private int[][] matrix;
    private int numVertices;

    // Constructor requires the total number of vertices upfront
    public GraphMatrix(int numVertices) {
        this.numVertices = numVertices;
        // In Java, integer arrays default to 0 automatically
        this.matrix = new int[numVertices][numVertices];
    }

    // Method to add an edge between two vertices
    public void addEdge(int source, int destination) {
        // Because the vertices act as array indices, we just set the coordinates to 1
        matrix[source][destination] = 1;
        
        // Because this is an UNDIRECTED graph, we also set the reverse coordinate to 1
        // (For a directed graph, delete or comment out the line below)
        matrix[destination][source] = 1;
    }

    // Method to print the matrix visually
    public void printGraph() {
        System.out.println("Graph Adjacency Matrix:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the graph
    public static void main(String[] args) {
        // Create a graph with 4 vertices. 
        // Note: We use 0-based indexing (Vertices are 0, 1, 2, and 3)
        GraphMatrix myGraph = new GraphMatrix(4);

        // Adding edges to match the previous example's structure
        myGraph.addEdge(0, 1);
        myGraph.addEdge(0, 2);
        myGraph.addEdge(1, 3);
        myGraph.addEdge(2, 3);
        myGraph.addEdge(0, 3);

        // Display the graph
        myGraph.printGraph();
    }
}