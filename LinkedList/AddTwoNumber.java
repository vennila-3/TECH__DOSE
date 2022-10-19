class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     ListNode head=new ListNode(-1);
        ListNode ptr=head;
        int carry=0;
   while(l1!=null || l2!=null)
   { 
     int sum=0;
     
    if(l1==null)
    sum+=l2.val+carry;
    else if(l2==null)
    sum+=l1.val+carry;
    else 
    sum+=l1.val+l2.val+carry; 

    ptr.next=new ListNode(sum%10);
    carry=sum/10; 
    ptr=ptr.next;
    
    if(l1!=null)
     l1=l1.next;
    if(l2!=null)
     l2=l2.next;
    
   } 
    if(carry!=0)
    { 
     ptr.next=new ListNode(carry);
     ptr=ptr.next;
    }
        return head.next;
    }
}
