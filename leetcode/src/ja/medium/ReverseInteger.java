package ja.medium;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */
public class ReverseInteger {
    public static int reverse(int x){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(x);
        stringBuilder.reverse();
        int index = 0;
        if(stringBuilder.charAt(index)=='0'){
            while(stringBuilder.charAt(index)=='0'&&index<stringBuilder.length()-1){
                if(index==stringBuilder.length()-1){return 0;}
                index++;
            }
            stringBuilder = new StringBuilder(stringBuilder.substring(index));
        }
        if(stringBuilder.charAt(stringBuilder.length()-1)=='-'){
            stringBuilder.insert(0,'-');
            stringBuilder = new StringBuilder(stringBuilder.substring(0,stringBuilder.length()-1));
        }

        int result = Integer.parseInt(stringBuilder.toString());
        try{
            result = Integer.parseInt(stringBuilder.toString());
            if(result>2147483647  ||result<-2147483648){return 0;}
            return result;
        }catch(Exception e){
            return 0;
        }
     //   if(result>2147483647  ||result<-2147483648){return 0;}

     //   return result;

    }
    public static void main(String[]args){
        System.out.println(reverse(-1560));
    }
}
