 public int braces(String A) {

        /*
         * make a stack
         * loop throuth the string
         * if you find the closing bracket
         * then pop until you find the closing bracket
         * now, between the opening and closing there were no operators then there
         * is one pair of redundant braces are found
         */
        Stack<Character> st = new Stack<>();

        for(int i=0;i<A.length();i++)
        {
            char c = A.charAt(i);
            if(c == ')' )
            {
                char ch = st.pop();
                boolean hasOperator = false;

                while(ch != '(')
                {
                    if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
                    {
                        hasOperator = true;
                    }
                    ch = st.pop();
                }
                if(!hasOperator)
                {
                    return 1;
                }
            }
            else
            {
                st.push(c);
            }
            
        }
        return 0;
    }
