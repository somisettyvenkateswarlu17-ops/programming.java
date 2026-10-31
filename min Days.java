class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((long) m * k > n) {
            return -1;
        }
        int low = 1;
        int high = 0;
        for (int i = 0; i < n; i++) {
            high = Math.max(high, bloomDay[i]);
        }
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int flowers = 0;
            int bouquets = 0;
            for (int i = 0; i < n; i++) {
                if (bloomDay[i] <= mid) {
                    flowers++;
                    if (flowers == k) {
                        bouquets++;
                        flowers = 0;
                    }
                } else {
                    flowers = 0;
                }
            }
            if (bouquets >= m) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
