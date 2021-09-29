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
public class Solution {
    public boolean hasCycle(ListNode head) {
       if(head == null){
           return false;
       }
       ListNode hare = head;
       ListNode turt = head;
       while(hare != null){
           hare = hare.next;
           if(hare != null){
               hare = hare.next;
               turt = turt.next;
           }else{
               return false;
           }
           if(hare == turt){
               return true;
           }
        }
        
        
    return false;
    }
}
//pretty fast using floyds cycle detection algo. If tortise ever matches with hare there is def a cycle somewhere.
