package ja.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LastStoneWeight {

public static void main(String[]args){
   int[] newArray = new int[]{6,1,8,1,3};

    int[] newArray2 = new int[]{1,1,2,2};


   System.out.println(lastStoneWeight(newArray));
    System.out.println(lastStoneWeight(newArray2));
}

    public static int lastStoneWeight(int[] stones){
     List<Integer> newList= Arrays.stream(stones).
             mapToObj(i->i).sorted(Collections.reverseOrder())
             .collect(Collectors.toList());

            int index = 0;
            int temp = 1;
            int result = 0;
        while(newList.size()>1) {
            if (newList.get(index) == newList.get(temp)) {
                    newList.remove(0);
                    newList.remove(0);
            }
            else if (newList.get(index) != newList.get(temp)) {
                result = newList.get(index) - newList.get(temp);
                newList.remove(0);
                newList.remove(0);
                newList.add(result);
                newList.sort(Collections.reverseOrder());
            }

        }
        if(newList.size()==1){return newList.get(0);}
        return 0;
    }
}
