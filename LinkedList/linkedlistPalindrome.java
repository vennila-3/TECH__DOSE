class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int s=list.size();
        for(int i=0,j=s-1;i<=j;i++,j--)
        {
            if(list.get(i)!=list.get(j))
                return false;
        }
    
    return true;
    }
}
