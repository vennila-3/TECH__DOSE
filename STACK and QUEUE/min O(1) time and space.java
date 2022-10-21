class MinStack {
   int min;
    Stack<Integer> stack=new Stack<Integer>();
    public MinStack() {
        this.min=Integer.MAX_VALUE;//keeping min is large
    }
    
    public void push(int val) {
        if(val<=min)//if curr val is less than min
        {
            stack.push(min);//adding prev min
            min=val;//update curr min
        }
        stack.push(val);//pushing val
        
    }
    
    public void pop() {
        if(stack.pop()==min)//if poping element is min
        {
            min=stack.pop();//then remove next min;
        }
        
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return min;
        
    }
}
