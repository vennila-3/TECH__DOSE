class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        this.stack1=new Stack<>();
        this.stack2=new Stack<>();
        
    }
    
    public void push(int x) {
        stack1.push(x);
        
    }
    
    public int pop() {
        while(stack1.size()>1)
        {
            int back=stack1.pop();
            stack2.push(back);
        }
        int val=stack1.pop();
        while(!stack2.empty())
        {
            int back=stack2.pop();
            stack1.push(back);
        }
        return val;
        
    }
    
    public int peek() { 
        while(stack1.size()>0)
        {
            int front=stack1.pop();
            stack2.push(front);
        }
        int val=stack2.peek();
        while(!stack2.empty())
        {
            int front=stack2.pop();
            stack1.push(front);
        }
        return val;
    }
    
    public boolean empty() {
        return stack1.empty();
        
    }
}
