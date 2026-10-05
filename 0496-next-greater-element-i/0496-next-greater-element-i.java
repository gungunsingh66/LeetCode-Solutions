class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n];
        for(int i = m-1; i>=0 ; i--){
            while(!stack.isEmpty() && stack.peek()<= nums2[i]){
                stack.pop();
            }
            int top = stack.isEmpty()? -1 : stack.peek();
            map.put(nums2[i] , top);
            stack.push(nums2[i]);
        }
        for(int i = 0 ; i<n ; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}