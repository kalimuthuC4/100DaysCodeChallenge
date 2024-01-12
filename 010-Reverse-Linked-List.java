// 206. Reverse Linked List

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null,cur =head,nn;
        while(cur!=null)
        {
            nn = cur.next;
            cur.next = prev;
            prev = cur; 
            cur = nn;           
        }
        return prev;
        
    }
}
