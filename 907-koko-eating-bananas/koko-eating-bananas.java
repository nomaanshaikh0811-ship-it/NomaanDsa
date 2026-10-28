
class Solution {

    public long calculateTotalTime(int[] a, int speed) {
        long hours = 0;

        for (int i = 0; i < a.length; i++) {
            hours += a[i] / speed;

            if (a[i] % speed != 0) {
                hours++;
            }
        }

        return hours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = piles[0];
        int res = high;

        for (int i = 1; i < piles.length; i++) {
            high = Math.max(high, piles[i]);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long hour = calculateTotalTime(piles, mid);

            if (hour > h) {
                low = mid + 1;
            } else {
                res = mid;
                high = mid - 1;
            }
        }

        return res;
    }
}
