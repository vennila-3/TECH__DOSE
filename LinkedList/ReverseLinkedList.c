struct ListNode* reverseList(struct ListNode* head){ 
    struct ListNode *temp=NULL;
    struct ListNode *temp2=NULL;
    while(head!=NULL)
        { 
     temp2=head->next;
     head->next=temp;
        temp=head;
       head=temp2;
        
        } 
    head=temp;
    return head;

}
