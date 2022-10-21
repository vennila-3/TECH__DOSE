class Solution {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<Integer>();
        int result=0;
        int number=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isDigit(c))
            {
                number=number*10+(int)(c-'0');
                
            }
            else if(c=='+')
            {
                result+=(sign*number);
                number=0;
                sign=0;
            }
            else if(c=='-')
            {
                result+=(sign*number);
                number=0;
                sign=-1;
            }
            else if(c=='(')//if open paranthesis comes
            {
                st.push(result);
                st.push(sign);
                sign=1;
                result=0;
                
            }
            else if(c==')')
            {
                result+=sign*number;//multiply number with sign and add to result
                number=0;
                result*=st.pop();
                result+=st.pop();
            }
        }
        if(number!=0)result+=number*sign;
        return result;
        
    }
}
