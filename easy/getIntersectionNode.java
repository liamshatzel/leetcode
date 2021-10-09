/*
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
//Runtime: 1 ms, faster than 98.30% of Java online submissions for Intersection of Two Linked Lists.
//Memory Usage: 42 MB, less than 59.67% of Java online submissions for Intersection of Two Linked Lists.
//I hate that this works and I hate that I wrote it.
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
           ListNode cur1 = headA;
           ListNode cur2 = headB;
           int count = 0;
           int count1 = 0;
           while(cur1.next != null){
              count++;
              cur1 = cur1.next;
           }
           ListNode tail = cur1.next;
           while(cur2.next != null){
              count1++; 
              cur2 = cur2.next;
           }
        
           int counted = 0;
           ListNode cur3 = new ListNode();
           ListNode cur4 = new ListNode();
           if(count < count1){
               counted  = count1 - count;
               cur3 = headB;
               cur4 = headA;
           }else{
               cur3 = headA;
               cur4 = headB;
               counted = count - count1;
           }
           //System.out.println(counted);
           for(int i = 0; i < counted; i++){
                   cur3 = cur3.next;   
           }
           while(cur3 != null){
              //System.out.println("3: " + cur3.val);
              //System.out.println("4: " + cur4.val);
              if(cur3 == cur4){
                  return cur3;
              }
              cur3 = cur3.next;
              cur4 = cur4.next;
           }
        return cur3;
               
    }
}
