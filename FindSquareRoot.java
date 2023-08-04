public int sqrt(int A) {
        /*first we need to make two pointers for logn
        first = 0
        second = A
        now loop till first<=second
        take the mid
        make square of mid
        if the mid is equal to the square then return the int cast of mid
        else if mid < square then increase the left part
        else decrease the right part
        if after the loop we dont find the value then return either left or right int cast
        */
        
        if(A<=1)
        {
            return A;
        }
        
        long left = 0;
        long right = A;
        
        while(left <= right)
        {
            long mid = left + (right-left)/2;
            long square = mid*mid;
            
            if(square == A)
            {
                return (int) mid;
            }
            else if(square < A)
            {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        
        return (int)right;
    }
