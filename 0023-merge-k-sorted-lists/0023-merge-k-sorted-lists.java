/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // ListNode merge(ListNode[] lists, int left, int right) {
    //     if (left == right) {
    //         return lists[left];
    //     }
    //     int mid = left + (right - left) / 2;
        
    //     ListNode leftList = merge(lists, left, mid);
    //     ListNode rightList = merge(lists, mid + 1, right);
    //     return mergeTwoLists(leftList, rightList);
    // }

    // ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //     ListNode dummy = new ListNode(0);
    //     ListNode tail = dummy;
    //     while (l1 != null && l2 != null) {
    //         if (l1.val <= l2.val) {
    //             tail.next = l1;
    //             l1 = l1.next;
    //             tail = tail.next;
    //         } else {
    //             tail.next = l2;
    //             l2 = l2.next;
    //             tail = tail.next;
    //         }
    //     }
    //     tail.next = (l1 == null) ? l2 : l1;
    //     return dummy.next;
    // }

    // public ListNode mergeKLists(ListNode[] lists) {
    //     // if(lists == null || lists.length == 0){
    //     //     return null;
    //     // }
    //     // int right = lists.length-1;
    //     // int left = 0;
    //     // return merge(lists, left, right);
    // }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.val,b.val));
        for(ListNode head: lists){
            if(head != null){
                pq.offer(head);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(!pq.isEmpty()){
            ListNode small = pq.poll();
            tail.next = small;
            tail = tail.next;
            small = small.next;
            if(small != null){
                pq.offer(small);
            }
        }
        return dummy.next;
    }
}