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
public ListNode deleteDuplicates(ListNode head) {
        
        
        if(head == null){
            return head;
        }
        
		
		ListNode resultNode = new ListNode(head.val);
		ListNode resultCount = resultNode;
		ListNode currNode = head;
		
		
		while(currNode != null) {
			if(currNode.val == resultCount.val) {
				currNode = currNode.next;
			}else {
				resultCount.next = new ListNode(currNode.val);
				resultCount = resultCount.next;
			}
		}
		

		return resultNode;
	
    }
}