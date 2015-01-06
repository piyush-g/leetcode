/**
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array A = [1,1,2],

Your function should return length = 2, and A is now [1,2].
*/
public class RemoveDuplicatesInArrayInPlace {
    public int removeDuplicates(int[] A) {
        if(A.length<2)
            return A.length;
        int current = 1;
        for(int i=1;i<A.length;i++)
        {
            if(A[i]!=A[i-1])
                A[current++]=A[i];
        }
        return current;
    }
}