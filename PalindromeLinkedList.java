/**
 * @Author: Krishna Kalavacharla <Chaitu>
 * @Date:   2020-07-28T23:50:48-04:00
 * @Email:  kalavacharla.kc@gmail.com
 * @Last modified by:   Chaitu
 * @Last modified time: 2020-07-28T23:51:15-04:00
 */



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
class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {

        if(head==null) return false;

        List<Integer> list = populateList(head);

        return isPalindrome(list);

    }

    private List<Integer> populateList(ListNode head){
        List<Integer> list = new ArrayList();

        while(head!=null){
            list.add(head.val);
            head = head.next;
        }

        return list;
    }

    private boolean isPalindrome(List<Integer> list){

        int left = 0;
        int right = list.size()-1;

        while(left<=right){
            if(list.get(left)==list.get(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }

        return true;
    }
}
