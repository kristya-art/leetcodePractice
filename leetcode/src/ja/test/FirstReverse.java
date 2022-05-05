package ja.test;

public class FirstReverse {
    public static void main(String[]args){
        System.out.println(FirstReverse("koka uty e!"));
    }

    public static String FirstReverse(String str) {
        StringBuilder reversedStr = new StringBuilder("");
        for(int i=str.length()-1;i>=0;i--){
            reversedStr.append(str.charAt(i));
        }
        return reversedStr.toString();
    }
}
