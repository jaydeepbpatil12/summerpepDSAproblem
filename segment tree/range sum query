class NumArray {
    private final int[] tree;
    private final int n;

    public NumArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            this.n = 0;
            this.tree = new int[0];
            return;
        }

        this.n = nums.length;
        this.tree = new int[4 * n];
        build(nums, 1, 0, n - 1);
    }

    private void build(int[] nums, int node, int left, int right) {
        if (left == right) {
            tree[node] = nums[left];
            return;
        }

        int mid = left + (right - left) / 2;
        build(nums, node * 2, left, mid);
        build(nums, node * 2 + 1, mid + 1, right);
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }

    public int sumRange(int left, int right) {
        if (left < 0 || right >= n || left > right) {
            throw new IllegalArgumentException("Invalid range");
        }
        return query(1, 0, n - 1, left, right);
    }

    private int query(int node, int left, int right, int qLeft, int qRight) {
        if (qLeft <= left && right <= qRight) {
            return tree[node];
        }

        if (right < qLeft || qRight < left) {
            return 0;
        }

        int mid = left + (right - left) / 2;
        return query(node * 2, left, mid, qLeft, qRight)
                + query(node * 2 + 1, mid + 1, right, qLeft, qRight);
    }
}

/*
Example:
NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
System.out.println(numArray.sumRange(0, 2)); // 1
System.out.println(numArray.sumRange(2, 5)); // -1
System.out.println(numArray.sumRange(0, 5)); // -3
*/
