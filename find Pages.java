class Solution { 
    public static int findPages(int[] arr, int k) {   
        if (k > arr.length) return -1;
        int low = 0, high = 0;
        for (int x : arr) {
            low = Math.max(low, x);
            high += x;
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            int students = 1, pages = 0;
            
            for (int x : arr) {
                if (pages + x > mid) {
                    students++;
                    pages = x;
                } else {
                    pages += x;
                }
            }
            if (students > k)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}
