 ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int count = 1;
        int end = A*A;

        int top = 0;
        int left = 0;
        int bottom = A-1;
        int right = A-1;

        for(int i=0;i<A;i++)
        {
            ans.add(new ArrayList<>());
            for(int j=0;j<A;j++)
            {
                ans.get(i).add(0);
            }
        }

        int dir = 0;

        while(count<= end)
        {
            if(dir == 0)
            {
                for(int i=left;i<=right;i++)
                {
                    ans.get(top).set(i, count++);
                }
                top++;
            }
            
            else if(dir == 1)
            {
                for(int i=top;i<=bottom;i++)
                {
                    ans.get(i).set(right, count++);
                }

                right--;
            }
            else if(dir == 2)
            {
                for(int i=right;i>=left;i--)
                {
                    ans.get(bottom).set(i, count++);
                }
                bottom--;

            }
            else{

                for(int i=bottom;i>=top;i--)
                {
                    ans.get(i).set(left, count++);
                }
                left++;

            }

           dir = (dir+1)%4;
        }

        return ans;
    }
