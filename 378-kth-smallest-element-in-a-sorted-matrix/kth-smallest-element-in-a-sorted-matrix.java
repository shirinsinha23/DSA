class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int l = matrix[0][0], h = matrix[n - 1][n - 1], mid, count;
        while (l < h) {
            count = 0;
            mid = l + (h - l) / 2;
            for (int i = 0; i < n; i++) {
                int lo = 0, hi = n;
                while (lo < hi) {
                    int md = (lo + hi) / 2;
                    if (matrix[i][md] <= mid) lo = md + 1;
                    else hi = md;
                }
                count += lo;
            }
            if (count < k) l = mid + 1;
            else h = mid;
        }
        return l;
    }
}