package LinkedListProblems;

import LinkedListProblems.RemoveNthNodefromendoflist.ListNode;

/*

1171. Remove Zero Sum Consecutive Nodes from Linked List
Given the head of a linked list, we repeatedly delete consecutive sequences of nodes that sum to 0 until there are no such sequences.
After doing so, return the head of the final linked list.  You may return any such answer.


(Note that in the examples below, all sequences are serializations of ListNode objects.)
Example 1:
Input: head = [1,2,-3,3,1]
Output: [3,1]
Note: The answer [1,2,1] would also be accepted.

Example 2:
Input: head = [1,2,3,-3,4]
Output: [1,2,4]

Example 3:
Input: head = [1,2,3,-3,-2]
Output: [1]
 */
public class RemoveZeroSumConsecutive {
    public ListNode removeZeroSumSublists(ListNode head) {
        if(head==null)
        return head;
        ListNode current=head;
        int sum=0;
        while(current!=null) 
        {
            sum+=current.val;
            if(sum==0) 
            {
                head=current.next;
                return removeZeroSumSublists(head);
            }
            current=current.next;
        }
        head.next=removeZeroSumSublists(head.next);
        return head;
    }
    
}
