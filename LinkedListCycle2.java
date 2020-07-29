/**
 * @Author: Krishna Kalavacharla <Chaitu>
 * @Date:   2020-07-28T23:42:12-04:00
 * @Email:  kalavacharla.kc@gmail.com
 * @Last modified by:   Chaitu
 * @Last modified time: 2020-07-28T23:42:27-04:00
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
public class LinkedListCycle2 {
    Set<ListNode> set = new HashSet();

    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;

        ListNode temp = head;
        while(temp!=null){

            if(set.contains(temp)){
                return temp;
            }

            set.add(temp.next);
            temp = temp.next;
        }

        return null;

    }
}
