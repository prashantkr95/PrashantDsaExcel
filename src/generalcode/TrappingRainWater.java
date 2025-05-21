package generalcode;

public class TrappingRainWater {
    public static int waterTrapped(int arr[])
    {
        int result=0;
        int left=1;
        int right=arr.length-2;
        int lmax=arr[left-1];
        int rmax=arr[right+1];
        while(left<=right)
        {
            if(lmax<=rmax)
            {
                result=result+Math.max(0,lmax-arr[left]);
                lmax=Math.max(lmax,arr[left]);
                left=left+1;
            }
            else {
                result=result+Math.max(0,rmax-arr[right]);
                rmax=Math.max(rmax,arr[right]);
                right=right-1;
            }
        }
        return result;
    }
}
