public class mergeKll {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    public ListNode merge2Lists(ListNode l1,ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.val<=l2.val){
            l1.next=merge2Lists(l1.next,l2);
            return l1;
        }
        else{
            l2.next=merge2Lists(l2.next,l1);
            return l2;
        }
       
    }
    public ListNode partAndmerge(ListNode[] lists,int st,int end) {
        if(st>end){
            return null;
        }
        if(st==end){
            return lists[st];
        }
        int mid=st+(end-st)/2;
        ListNode L1=partAndmerge(lists,st,mid);
        ListNode L2=partAndmerge(lists,mid+1,end);

        return merge2Lists(L1,L2);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int k=lists.length;
        if(k==0){
            return null;
        }
        return partAndmerge(lists,0,k-1);
    }
}

