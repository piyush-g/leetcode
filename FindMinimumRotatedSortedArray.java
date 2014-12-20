/*
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
*/

public class FindMinimumRotatedSortedArray {
    public int findMin(int[] num) {
        int l = 0;
        int r = num.length-1;
        
        while(l<r)
        {
            if(num[l]<num[r])
                return num[l];
            
            int m = (l+r)/2;
            if(num[l]<=num[m])
            {
                //left is ordered, go search right
                l=m+1;
            }
            else
            {
                //right is unordered, go search left
                r=m;
            }
        }
        return num[l];
    }
}