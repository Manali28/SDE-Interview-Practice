/**
 * @Author: Krishna Kalavacharla
 * @Date:   2020-07-28T23:14:49-04:00
 * @Email:  kalavacharla.kc@gmail.com
 * @Last modified by:   Krishna Kalavacharla
 * @Last modified time: 2020-07-28T23:14:58-04:00
 */



/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow!=null && fast!=null && slow.val==fast.val){
                return true;
            }
        }

        return false;



    }
}
