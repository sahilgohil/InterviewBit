 public int solve(String A) {
        
        Stack<Character> st = new Stack();
        
        for(int i=0;i<A.length();i++)
        {
            char c = A.charAt(i);
            
            if(c == '(')
            {
                st.push(c);
            }
            else{
                if(st.isEmpty())
                {
                    return 0;
                }
                else{
                    while(st.peek() != '(')
                    {
                        st.pop();
                    }
                    st.pop();
                }
            }
        }
        if(st.size() >0)
        {
            return 0;
        }
        
        return 1;
    }
