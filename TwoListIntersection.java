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
public class TwoListIntersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB == null)
            return null;
        int lengthA = 1, lengthB=1;
        ListNode tempA = headA, tempB = headB;
        while(tempA.next!=null)
        {
            lengthA++;
            tempA=tempA.next;
        }
        while(tempB.next!=null)
        {
            lengthB++;
            tempB=tempB.next;
        }
        if(tempA!=tempB)
            return null;
        if(lengthB>lengthA)
        {
            tempA = headA;
            headA=headB;
            headB=tempA;
            lengthA=lengthA+lengthB;
            lengthB=lengthA-lengthB;
            lengthA=lengthA-lengthB;
        }
        tempA=headA;
        while(lengthA!=lengthB)
        {
            tempA=tempA.next;
            lengthA--;
        }
        tempB = headB;
        while(tempA!=tempB)
        {
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }
}