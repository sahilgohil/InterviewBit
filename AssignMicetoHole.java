public int mice(ArrayList<Integer> A, ArrayList<Integer> B) {
        /*
        here basically we will have to sort the array and find the maximum absolute difference betwwne 
        the mouse and the hole that will give use the min amount of time required for one mouse to reach its 
        position there fore that will be the lowest possible time that mouse can take to reach theri destination
        */
        
        if(A.size() != B.size())
        {
            return -1;
        }
        
        Collections.sort(A);
        Collections.sort(B);
        
        int maxTime = Integer.MIN_VALUE;
        
        for(int i=0;i<A.size();i++)
        {
            int t = Math.abs(A.get(i) - B.get(i));
            maxTime = Math.max(t,maxTime);
            
        }
        
        return maxTime;
    }
