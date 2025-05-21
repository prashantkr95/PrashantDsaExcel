package generalcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static String findFirstNonrepeating(String s2)
    {
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
        for(int i=0;i< s2.length();i++)
        {
            hm.put(s2.charAt(i),hm.getOrDefault(s2.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry:hm.entrySet())
        {
            if(entry.getValue()==1)
            {
                return entry.getKey().toString();
            }
        }
        return "";
    }
}
