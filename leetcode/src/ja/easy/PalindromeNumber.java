package ja.easy;

/**
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward.
 *
 * For example, 121 is a palindrome while 123 is not.
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x){
       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append(x);
       if(stringBuilder.length()==1){return true;}

       int i = stringBuilder.length()-1;
       int j = 0;
       while(i>=stringBuilder.length()/2){
           if(stringBuilder.charAt(i)==stringBuilder.charAt(j)){
               i--;
               j++;
           }
           else{return false;}

       }
       return true;
    }

    public static  void main(String[]args){
        long startTime = System.nanoTime();
        System.out.println(isPalindrome(-01));
        long endTime = System.nanoTime();

        System.out.println(endTime - startTime);
        System.out.println(isPalindrome(223));
        System.out.println(isPalindrome(656));
        System.out.println(isPalindrome(9));
        System.out.println(isPalindrome(333));


    }
}
