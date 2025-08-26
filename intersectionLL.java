public class intersectionLL {

 public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
         val = x;
         next = null;
     }
 }
 
public class Solution {

    private int getlength(ListNode node){
        int len=0;
        while(node!=null){
            len++;
            node=node.next;
        }
        return len;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA==null||headB==null){
            return null;
        }

        int lenA=getlength(headA);
        int lenB=getlength(headB);

        while(lenA>lenB){
            headA=headA.next;
            lenA--;
        }

        while(lenB>lenA){
            headB=headB.next;
            lenB--;
        }

        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}
}
