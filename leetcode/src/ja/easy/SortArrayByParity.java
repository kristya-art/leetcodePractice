package ja.easy;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Given an integer array nums, move all the even integers at the beginning of the array followed
 * by all the odd integers.
 */
public class SortArrayByParity {
public static void main(String []args){
    int[] newArray = {1,2,4,3,4,5,0,8};

    System.out.println(Arrays.toString(sortArrayByParity(newArray)));
}
    public static int[] sortArrayByParity(int[] nums){
        int[] result = new int[nums.length];

        IntStream stream = Arrays.stream(nums);
        IntStream stream2 = Arrays.stream(nums);

        result=  IntStream.concat(
                stream.filter(i->i%2==0),
                stream2.filter(i->i%2!=0)
        ).toArray();
        return result;
    }
    }

