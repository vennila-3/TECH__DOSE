struct ListNode* deleteDuplicates(struct ListNode* head){ 
   if(head==NULL)
       return head;
   struct ListNode *curr=head;
   struct ListNode *tail=head;
    while(curr)
    { 
     if(curr->val!=tail->val)
      tail=tail->next=curr;
     curr=curr->next;
    }
    tail->next=NULL;
   return head;
}
