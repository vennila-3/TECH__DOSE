struct ListNode* isLengthK(struct ListNode* head,int k){
    while(head!=NULL && --k) head = head->next;
    return head;
}
struct ListNode* reverseKGroup(struct ListNode* head, int k){
    struct ListNode* node = isLengthK(head,k); 
    if(node == NULL) return head;
    struct ListNode* temp = reverseKGroup(node->next,k);
    struct ListNode* prev; 
    while(k--){
        prev = head->next;
        head->next = temp;
        temp = head;
        head = prev;
    }
    return temp;
}
Footer
© 2022 GitHub, Inc.
