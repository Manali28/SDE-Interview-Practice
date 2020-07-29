/**
 * @Author: Krishna Kalavacharla <Chaitu>
 * @Date:   2020-07-28T22:26:37-04:00
 * @Email:  kalavacharla.kc@gmail.com
 * @Last modified by:   Krishna Kalavacharla
 * @Last modified time: 2020-07-28T22:32:10-04:00
 */



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class DeleteNodeLinkedList {
    public void deleteNode(ListNode node) {
       node.val = node.next.val;
       node.next = node.next.next;
    }
}
