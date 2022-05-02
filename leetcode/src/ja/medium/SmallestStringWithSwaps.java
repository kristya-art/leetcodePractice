package ja.medium;

import java.util.ArrayList;
import java.util.List;

public class SmallestStringWithSwaps {

    public static void main (String []args){
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList1 = new ArrayList<>();
        subList1.add(1);
        subList1.add(2);
        List<Integer> subList2 = new ArrayList<>();
        subList2.add(3);
        subList2.add(4);

        list.add(subList1);
        list.add(subList2);
        System.out.println(smallestStringWithSwaps("absck",list));
    }
    public static String smallestStringWithSwaps(String s, List<List<Integer>> list){
        StringBuilder strB = new StringBuilder(s);

        //this is a help function to find out the minimum string
        StringBuilder strBnew = new StringBuilder("");
        int indexTemp = 0;
        int i =0;
               while(strB.length()>0) {
               char newChar = strB.charAt(i);
               if(strB.length()==1){strBnew.append(newChar);strB.deleteCharAt(i);break;}
               for (int j = i+1; j < strB.length(); j++) {
                   if (newChar > strB.charAt(j)) {
                       newChar = strB.charAt(j);
                       indexTemp = j;
                   }
               }
                   strBnew.append(newChar);
                   strB.deleteCharAt(indexTemp);
                   System.out.println(strB.toString());

               }

//


        return strBnew.toString();
    }
}
