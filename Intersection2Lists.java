/**
 * @Author: Krishna Kalavacharla
 * @Date:   2020-07-28T23:11:41-04:00
 * @Email:  kalavacharla.kc@gmail.com
 * @Last modified by:   Krishna Kalavacharla
 * @Last modified time: 2020-07-28T23:12:19-04:00
 */



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Intersection2Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = size(headA);
        int sizeB = size(headB);

        ListNode first = null;
        ListNode second = null;

        if(sizeA>sizeB){
            first = moveNSteps(headA,sizeA-sizeB);
            second = headB;
        }else{
            first = headA;
            second = moveNSteps(headB,sizeB-sizeA);
        }

        while(first!=second){
            first = first.next;
            second = second.next;
        }

        return first;

    }

    private ListNode moveNSteps(ListNode head,int n){
        ListNode temp = head;
        while(n>0){
            temp = temp.next;
            n--;
        }

        return temp;
    }

    private int size(ListNode head){
        if(head==null) return 0;

        int count = 0;
        while(head!=null){
            head = head.next;
            count++;
        }

        return count;
    }
}
