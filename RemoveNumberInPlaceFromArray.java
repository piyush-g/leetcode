/**
Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
*/
public class RemoveNumberInPlaceFromArray {
    int removeElement(int A[], int elem) {
        int n = A.length;
        int i = 0;
        while (i < n) {
            if (A[i] == elem) {
                A[i] = A[n - 1];
                n--;
            }
            else
                i++;
        }
        return n;
    }

    /**
    The solution below works faster and has lesser number of lines of code. Logically it may be seem that above function might work 
    faster
    */
    public class Solution {
    int removeElement(int A[], int elem) {
        int current=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]!=elem)
                A[current++]=A[i];
        }
        return current;
    }
}
}