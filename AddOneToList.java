public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
           int rem = 0;
         for(int i=A.size()-1;i>=0;i--)
         {
            
            if(i == A.size()-1)
            {
                int lastDigit = A.get(i)+1; // adding 1 to last digit
                // set the last digit
                A.set(i, lastDigit%10);
                // get the reminder
                rem = lastDigit/10;
            }
            else{

                int digit = A.get(i) + rem;// adding the reminder to this digit
                // set
                A.set(i, digit%10);
                //rem
                rem = digit/10;
            }

         }
         if(rem > 0)
         {
            A.add(0, rem);
         }
         
         int nonZeroIdx = 0;
         while(nonZeroIdx < A.size() && A.get(nonZeroIdx) == 0)
         {
            nonZeroIdx++;
         }
         A.subList(0, nonZeroIdx).clear();

         return A;
    }
