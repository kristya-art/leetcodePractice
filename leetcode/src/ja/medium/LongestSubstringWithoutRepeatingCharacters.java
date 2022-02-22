package ja.medium;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s){
        List<Character> list ;

        int listLength = 0;
        for(int i = 0;i<s.length();i++) {
            list=new ArrayList<Character>();
            int j = i;
            while (!list.contains(s.charAt(j))&&j<s.length()) {
                list.add(s.charAt(j));
                if(j==s.length()-1){break;}
                j++;
            }
            if(listLength<list.size()){listLength=list.size();}


        }
        return listLength;
            }

            public static void main(String []args){
        int result = lengthOfLongestSubstring("amadon");
        System.out.println(result);
            }
        }
