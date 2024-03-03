package LinkedListProblems;

/*
19. Remove Nth Node From End of List

Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1] */
public class RemoveNthNodefromendoflist {
    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public int length(ListNode head){
        int count =0;
        while(head!=null){
            head=head.next;
            count++;
        }


        return count ;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
                if(head.next == null)
            return null;

        int x = length(head);
        if(n == x)
            return head.next;

        ListNode temp = head;
        int c = x-n;
        int i =1;
        while(i<c){
            temp=temp.next;
            i++;
        }

        temp.next=temp.next.next;


        return head;
        
    }
    
}
