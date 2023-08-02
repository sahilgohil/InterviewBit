        /*
         * the highest product of three integer can be achieved by two ways
         * 1-> if the nubers are positive, then taking the product of the largest 3 positive nums
         * 2-> if some of the numbers are negetive, then taking the product of two small negative and then multiplying them with the 
         * largest positive num.
         * the max of these two can give us the highest product
         */

         int n = A.size();
         Collections.sort(A);

         int p1 = A.get(n-3)*A.get(n-2)*A.get(n-1);
         int p2 = A.get(0) * A.get(1) * A.get(n-1);

         return Math.max(p1, p2);
