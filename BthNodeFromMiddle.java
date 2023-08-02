public int solve(ListNode A, int B) {
  /*
  first find the length of the linked list
  midd = len/2 +1
  then make initial pos = 1
  and target pos = mid - B
  until you reach the target position make the current go next
  if you dont find any then return -1
  */
        int lenght = 0;
        ListNode curr = A;
        
        while(curr != null)
        {
            curr = curr.next;
            lenght++;
        }
        
        curr = A;
        int currPos = 1;
        int targetPos = ((lenght/2)+1) - B;
        while(curr != null)
        {
            if(currPos == targetPos)
            {
                return curr.val;
            }
            currPos++;
            curr = curr.next;
        }
        
        return -1;
    }
