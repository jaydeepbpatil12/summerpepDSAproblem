public class SegmentTree {
    private int[] tree;
    private int[] arr;

    // Constructor to initialize the segment tree
    public SegmentTree(int[] inputArr) {
        this.arr = inputArr;
        int n = arr.length;
        
        // The maximum size of segment tree array is 2 * (2^ceil(log2(n))) - 1
        // A safe and commonly used upper bound is 4 * n
        int maxHeight = (int) Math.ceil(Math.log(n) / Math.log(2));
        int maxSize = 2 * (int) Math.pow(2, maxHeight) - 1;
        
        tree = new int[maxSize];
        
        // Build the segment tree
        buildTree(0, 0, n - 1);
    }

    /**
     * Recursive function to build the segment tree.
     * @param nodeIndex The current index in the segment tree array
     * @param start The starting index of the current segment in the input array
     * @param end The ending index of the current segment in the input array
     */
    private void buildTree(int nodeIndex, int start, int end) {
        // Base case: If start == end, we have reached a leaf node (a single element)
        if (start == end) {
            tree[nodeIndex] = arr[start];
            return;
        }

        // Calculate the middle point to divide the segment into two halves
        int mid = start + (end - start) / 2;
        
        // Left child index is 2 * i + 1, Right child index is 2 * i + 2
        int leftChild = 2 * nodeIndex + 1;
        int rightChild = 2 * nodeIndex + 2;

        // Recursively build the left and right subtrees
        buildTree(leftChild, start, mid);
        buildTree(rightChild, mid + 1, end);

        // The current node's value is the sum of its left and right children
        tree[nodeIndex] = tree[leftChild] + tree[rightChild];
    }

    // Function to print the segment tree array
    public void printTree() {
        System.out.println("Segment Tree Array:");
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Sample input array
        int[] arr = {1, 3, 5, 7, 9, 11};
        
        System.out.println("Input Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Create Segment Tree object
        SegmentTree segTree = new SegmentTree(arr);

        // Print the segment tree array
        segTree.printTree();
    }
}