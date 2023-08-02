public static int searchInBitonicSequence(ArrayList<Integer> A, int B) {
        /* 
         * to search in the bitonic sequence
         * first use the binary search algorith to find the largest element's index
         * then perform two seperate binary search for the increasing segment and the decreasing segment
        */

        int si = 0;
        int peak = findPeak(A);
        int ei = A.size()-1;

        while(si<=peak)
        {
            int mid = si+(peak-si)/2;
            if(A.get(mid) == B)
            {
                return 1;
            }
            else if(A.get(mid) < B)
            {
                si = mid+1;
            }
            else{
                peak = mid-1;
            }
        }

        while(peak <= ei)
        {
            int mid = peak + (ei-peak)/2;
            if(A.get(mid) == B)
            {
                return 1;
            }
            else if(A.get(mid) < B)
            {
                ei = mid-1;
            }
            else{
                peak = mid+1;
            }

        }
        return 0;
    }

    public static int findPeak(ArrayList<Integer> A)
    {
        int si = 0;
        int ei = A.size()-1;
        while(si<ei)
        {
            int mid = si + (ei-si)/2;

            if(A.get(mid) < A.get(mid+1))
            {
                si = mid+1;
            }
            else{
                ei = mid;
            }
        }

        return si;
    }
