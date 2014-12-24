/**
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
*/
public class PlusOneIntegerArray {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--)
        {
            digits[i]++;
            if(digits[i]<10)
                break;
            else{
                if(i!=0)
                    digits[i]=digits[i]%10;
            }
        }
        if(digits[0]>=10)
        {
            digits[0]=digits[0]%10;
            int[] ret = new int[digits.length+1];
            ret[0]=1;
            for(int j=1;j<=digits.length;j++){
                ret[j]=digits[j-1];
            }
            return ret;
        }
        return digits;
    }
}