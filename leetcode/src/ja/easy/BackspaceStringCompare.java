package ja.easy;
/**
 * Given two strings s and t, return true if they are equal when  both
 * are typed into empty text editors.'#' means a backspace character.
 */

public class BackspaceStringCompare {
    public static void main(String []args){
        System.out.println(backspaceCompare("a##c","#a#c"));
    }
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder str1 = new StringBuilder(s);
        StringBuilder str2 = new StringBuilder(t);
        int index = 0;

        while (str1.toString().contains("#")) {
            index = str1.indexOf("#");

        if (index == 0) {
            str1.delete(index, index + 1);
        } else {
            str1.delete(index - 1, index + 1);
        }
    }
        while(str2.toString().contains("#")){
            index = str2.indexOf("#");
            if(index==0){str2.delete(index,index+1);}else{
            str2.delete(index-1,index+1);}
        }

        if(str1.toString().equals(str2.toString())){
            return true;
        }
        else {
        return false;}
    }


}
