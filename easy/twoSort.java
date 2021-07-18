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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode(0);
        ListNode temp = head;
        
        while(l1 != null && l2 != null){
            
        if(l1.val <= l2.val){
                temp.next = l1;
                l1 = l1.next;
        }else{
                temp.next = l2;
                l2 = l2.next;
            }
                temp = temp.next;
        }
            if(l1 != null){
                temp.next = l1;
            } else if (l2 != null){
                temp.next = l2;
            }
           
        return head.next;
    }
}
    /**
    
        int big = 0;
        int l1Num = greater(l1);
        int l2Num = greater(l2);
        ListNode temp = new ListNode();
        if(l1Num >= l2Num){
            big = l1Num;
        }else{
            big = l2Num;
        }
        big = l2Num + l1Num;
        temp.val = 1;
        int count = 0;
        
        for(int i = 1; i < big; i++){
       // while(l1.next != null && l2.next != null){
            count++;
            
     **/

       /**public int greater(ListNode compare){
            int counter = 1;
            while(compare.next != null){
                counter++;
                compare = compare.next;
            }
            return counter;
        } 
}**/
