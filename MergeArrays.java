/**
Given two sorted integer arrays A and B, merge B into A as one sorted array.

Note:
You may assume that A has enough space (size that is greater or equal to m + n) to hold additional elements from B. 
The number of elements initialized in A and B are m and n respectively.
*/
public class MergeArrays {
    public void merge(int a[], int m, int b[], int n) {
        int i=m-1, j=n-1, k=(m+n-1);
        while(k>=0)
        {
            if(j<0 || (i>=0 && a[i]>=b[j]))
            {
                a[k--]=a[i--];
            }
            else if(i<0 || (j>=0 && b[j]>a[i]))
            {
                a[k--]=b[j--];
            }
        }
    }
}

public class BetterMergeArrays {
    public void merge(int a[], int m, int b[], int n) {
        int i=m-1, j=n-1, k=(m+n-1);
        while(i>=0 && j>=0)
        {
            if(a[i]>=b[j])
            {
                a[k--]=a[i--];
            }
            else
            {
                a[k--]=b[j--];
            }
        }
        while(j>=0)
        {
            a[k--]=b[j--];
        }
    }
}