class Solution {
    public long minWaitingTime(int period, int[] lights, int[] arrivalTime) {
        long total = 0;

        for (int time : arrivalTime) {
            int r = time % period;
            int best = period;

            for (int light : lights) {
                if (r < light) {
                    best = 0;
                    break;
                }
            }

            if (best != 0) {
                best = period - r;
            }

            total += best;
        }

        return total;
    }
}
