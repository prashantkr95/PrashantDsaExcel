package generalcode;

public class BiarySearchMeadianOfTwoSorted {
    public static int findMedian(int arr1[],int arr2[])
    {
        int m=arr1.length;
        int n=arr2.length;
        if(m > n) {
            return findMedian(arr2, arr1);
        }
        int low=0;
        int high=m;
        while(low<=high)
        {
            int cut1=(low+high)/2;
            int cut2=(m+n+1)/2-cut1;
            int l1=(cut1==0)?Integer.MIN_VALUE:arr1[cut1-1];
            int l2=(cut2==0)?Integer.MIN_VALUE:arr2[cut2-1];
            int r1=(cut1==m)?Integer.MAX_VALUE:arr1[cut1];
            int r2=(cut2==n)?Integer.MAX_VALUE:arr2[cut1];
            if(l1>r2)
            {
                high=cut1-1;
            }
            else if(l2>r1)
            {
                low=cut1+1;
            }
            else {
                return (m+n)%2==0?(Math.max(l1,l2)+Math.min(r1,r2))/2:Math.max(l1,l2);
            }
        }
       // return 3;
        throw new IllegalArgumentException("Input arrays are not sorted");

    }
}
