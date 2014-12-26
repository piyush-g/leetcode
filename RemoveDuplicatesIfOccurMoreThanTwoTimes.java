/**
Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array A = [1,1,1,2,2,3],

Your function should return length = 5, and A is now [1,1,2,2,3].
*/
public class RemoveDuplicatesIfOccurMoreThanTwoTimes {
    public int removeDuplicates(int[] A) {
        if(A.length<3)
            return A.length;
        int current=2;
        for(int i=2;i<A.length;i++)
        {
            if(A[i]!=A[current-2])
            {
                A[current++]=A[i];
            }
        }
        return current;
    }
}