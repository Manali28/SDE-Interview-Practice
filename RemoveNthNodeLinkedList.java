/**
 * @Author: Krishna Kalavacharla
 * @Date:   2020-07-28T22:32:36-04:00
 * @Email:  kalavacharla.kc@gmail.com
 * @Last modified by:   Krishna Kalavacharla
 * @Last modified time: 2020-07-28T22:52:28-04:00
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
class RemoveNthNodeLinkedList {
  public ListNode removeNthFromEnd(ListNode head, int n) {

      int length = size(head);
      if(n>length) throw new IllegalStateException("Input exceeds the size of the list");

      int remaining = length-n;
      ListNode temp =moveNSteps(head,remaining);

      deleteNode(temp);
      return head;

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

  private void deleteNode(ListNode node){
      if(node.next!=null){
          node.val = node.next.val;
          node.next = node.next.next;
      }else{

          node.next = null;
      }
  }
}
