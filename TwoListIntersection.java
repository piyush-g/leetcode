/**
Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
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
public class TwoListIntersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB == null)
            return null;
        HashSet<ListNode> elementMap = new HashSet<ListNode>();
        while(headA!=null){
            elementMap.add(headA);
            headA=headA.next;
        }
        while(headB!=null)
        {
            if(elementMap.contains(headB))
                return headB;
            headB=headB.next;
        }
        return null;
    }

    
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