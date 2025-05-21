package generalcode;

public class CountAppend {
    public static String countAppend(String str)
    {
        StringBuilder sb=new StringBuilder();
        //abbcccdddd - a1b2c3d4
        int count=1;
        for(int i=1;i< str.length();i++)
        {
            if(str.charAt(i-1)!=str.charAt(i))
            {
                sb.append(str.charAt(i-1)).append(count);
                count=1;
            }
            else {
               // sb.append(s2.charAt(i-1)).append(count);
                count=count+1;
            }
        }
        sb.append(str.charAt(str.length()-1)).append(count);
        return sb.toString();
    }
}
