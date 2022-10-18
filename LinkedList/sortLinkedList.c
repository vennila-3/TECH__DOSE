struct ListNode * mergeSort(struct ListNode * head, struct ListNode * left, struct ListNode * right, int num);

struct ListNode* sortList(struct ListNode* head){
    int num = 1;
    struct ListNode * temp = head;
    if (temp == NULL)
        return NULL;
    while (temp->next != NULL){
        num++;
        temp = temp->next;
    }
    return mergeSort(head, head, temp, num);
}

struct ListNode * mergeSort(struct ListNode * head, struct ListNode * left, struct ListNode * right, int num){
    if (num <= 1){
        left->next = NULL;
        return left;
    }
    struct ListNode * temp = left;
    int i = 1;
    while (i < num/2){
        temp = temp->next;
        i++;
    }
    struct ListNode * a = temp->next;
    left = mergeSort(head, left, temp, i);
    temp = mergeSort(head, a, right, num - i);
    struct ListNode * tempHead = malloc(sizeof(struct ListNode));
    struct ListNode * nex = tempHead;
    while (1){
        if (left == NULL){
            nex->next = temp;
            break;
        }
        if (temp == NULL){
            nex->next = left;
            break;
        }
        if (left->val < temp->val){
            nex->next = left;
            left = left->next;
            nex = nex->next;
        }
        else{
            nex->next = temp;
            temp = temp->next;
            nex = nex->next;
        }
    }
    return tempHead->next;
}
