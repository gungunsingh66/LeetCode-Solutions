class Solution {
    public String minWindow(String s, String t) {
        // int[] count = new int[256];

        // for (char c : t.toCharArray()) {
        //     count[c]++;
        // }

        // int left = 0;
        // int required = t.length();

        // int minLen = Integer.MAX_VALUE;
        // int start = 0;

        // for (int right = 0; right < s.length(); right++) {

        //     // include current char
        //     if (count[s.charAt(right)] > 0) {
        //         required--;
        //     }
        //     count[s.charAt(right)]--;

        //     // when valid window
        //     while (required == 0) {

        //         // update answer
        //         if (right - left + 1 < minLen) {
        //             minLen = right - left + 1;
        //             start = left;
        //         }

        //         // remove left char
        //         count[s.charAt(left)]++;

        //         if (count[s.charAt(left)] > 0) {
        //             required++;
        //         }

        //         left++;
        //     }
        // }

        // return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
        int[] freq = new int[128];
        int n = t.length();
        int m = s.length();
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            char ch = t.charAt(i);
            freq[ch]++;
        }
        int required = n;
        int start = 0;
        int left = 0;
        for (int right = 0; right < m; right++) {
            char ch = s.charAt(right);
            if (freq[ch] > 0) {
                required--;
            }
            freq[ch]--;
            while (required == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                freq[s.charAt(left)]++;
                if (freq[s.charAt(left)] > 0) {
                    required++;
                }
                left++;
            }

        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}