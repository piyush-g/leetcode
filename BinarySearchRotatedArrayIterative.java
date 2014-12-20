/*
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume duplicate exists in the array.
*/
public class BinarySearchRotatedArrayIterative{
    public int search(int[] a, int target) {
        int l=0, r=a.length-1;
        while(l<=r)
        {
            int m=(l+r)/2;
            if(a[m]==target)
                return m;
            if(a[l]<a[m])
            {
                if(target>=a[l] && target<a[m]){
                    r=m-1;
                }
                else
                    l=m+1;
            }
            else if(a[m]<a[r])
            {
                if(target<=a[r] && target>a[m])
                    l=m+1;
                else 
                    r=m-1;
            }
            else if(a[l]==a[m])
            {
            	if(a[m]!=a[r])
            		l=m+1;
            	else
            		l=l+1;
            }
        }
        return -1;
    }
}