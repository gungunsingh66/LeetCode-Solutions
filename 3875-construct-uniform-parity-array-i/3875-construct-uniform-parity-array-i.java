class Solution {
    public boolean uniformArray(int[] nums1) {
        //return true;

        boolean hasOdd = false;
        boolean hasEven = false;

        for (int num : nums1) {

            if (num % 2 == 0) {
                hasEven = true;
            } else {
                hasOdd = true;
            }
        }

        // If all numbers already have the same parity
        if (!hasOdd || !hasEven) {
            return true;
        }

        // Mixed parity:
        // Keep any odd number unchanged.
        // For every even number, subtract an odd number:
        // even - odd = odd.
        return true;

    }
}