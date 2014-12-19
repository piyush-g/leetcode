/*
Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.
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
public class RotateLinkedList {
    public ListNode rotateRight(ListNode head, int n) {
        if(head==null || n==0)
            return head;
        ListNode temp=head, curr=head;
        for(int i=0;i<n;i++)
        {
            temp=temp.next;
            if(temp==null)
                temp=head;
        }
        if(temp==head)
            return head;
        while(temp.next!=null)
        {
            temp=temp.next;
            curr=curr.next;
        }
        temp.next=head;
        head=curr.next;
        curr.next=null;
        return head;
    }
}